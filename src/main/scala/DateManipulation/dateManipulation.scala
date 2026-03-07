package DateManipulation

import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

object dateManipulation extends App {

  Logger.getLogger("org").setLevel(Level.ERROR)

  val spark =SparkSession.builder().appName("DateManipulation").master("local[*]").getOrCreate()


  import spark.implicits._
//1. Convert string dates to proper date format.

  val dataframe1 = List(("2024-01-15"), ("2024-02-10")).toDF("date_str")

  val Into_date= dataframe1.withColumn("DateType",to_date(col("date_str"),"yyyy-MM-dd"))
  Into_date.printSchema()

  // Output: root
  // |-- date_str: string (nullable = true)
  // |-- DateType: date (nullable = true)

  //2. Extract year, month, and day from a timestamp.

  val dataframe2 = List(("2024-02-10 14:30:00")).toDF("timestamp_str")

  val Into_TS=dataframe2.withColumn("timeStamp",to_timestamp(col("timestamp_str"),"yyyy-MM-dd"))
    .withColumn("year",year(col("timeStamp")))
    .withColumn("month",month(col("timeStamp")))
    .withColumn("day",dayofmonth(col("timeStamp")))
  Into_TS.show()

  //  Output:
  //+-------------------+-------------------+----+-----+---+
  //|      timestamp_str|          timeStamp|year|month|day|
  //+-------------------+-------------------+----+-----+---+
  //|2024-02-10 14:30:00|2024-02-10 00:00:00|2024|    2| 10|
  //+-------------------+-------------------+----+-----+---+


  //3. Find the difference in days between two dates.

  val dataframe3 = List(("2024-01-01", "2024-02-01")).toDF("date1", "date2")

  dataframe3.withColumn("date1_cast", to_date($"date1"))
    .withColumn("date2_cast", to_date($"date2"))
    .withColumn("days_diff", datediff($"date2_cast", $"date1_cast")).show()

//  Output:
//  +----------+----------+----------+----------+---------+
//  |     date1|     date2|date1_cast|date2_cast|days_diff|
//  +----------+----------+----------+----------+---------+
//  |2024-01-01|2024-02-01|2024-01-01|2024-02-01|       31|
//    +----------+----------+----------+----------+---------+


  //4. Add 10 days to each date in a column.

  val dataframe4 = List(("2024-01-15"), ("2024-02-10")).toDF("date_str")
  //Expected Output: A new  column with date + 10 days.

  dataframe4.withColumn("toDate",to_date($"date_str"))
    .withColumn("Joining + 10 Days",
      date_add(col("date_str"), 10)).show()
//  Output:
//  +----------+----------+-----------------+
//  |  date_str|    toDate|Joining + 10 Days|
//  +----------+----------+-----------------+
//  |2024-01-15|2024-01-15|       2024-01-25|
//  |2024-02-10|2024-02-10|       2024-02-20|
//  +----------+----------+-----------------+


//5. Find the first and last date in a DataFrame.

  val dataframe5 = List(("2024-01-01"), ("2024-01-15"), ("2024-02-10")).toDF("date_str")
  //Expected Output: min(date) and max(date).

  dataframe5.withColumn("toDate",to_date($"date_str"))
    .agg(min($"toDate").as("MinDate"),max($"toDate").as("MaxDate")).show()
//  Output:
//  +----------+----------+
//  |   MinDate|   MaxDate|
//  +----------+----------+
//  |2024-01-01|2024-02-10|
//  +----------+----------+

//6. Extract weekday name from a date column.

  val dataframe6 = List(("2024-02-10")).toDF("date_str")

  dataframe6.withColumn("toDate", to_date($"date_str"))
    .withColumn("WeekDay", date_format(col("toDate"), "EEEE"))
    .show()

//  Output:
//  +----------+----------+--------+
//  |  date_str|    toDate| WeekDay|
//  +----------+----------+--------+
//  |2024-02-10|2024-02-10|Saturday|
//  +----------+----------+--------+

//7. Convert a UTC timestamp to Asia/Kolkata timezone.

  val dataframe7 = List(("2024-02-10 14:30:00", "UTC")).toDF("timestamp_str", "timezone")

  dataframe7.withColumn("utc_ts", to_timestamp($"timestamp_str"))
    .withColumn("List_ts", from_utc_timestamp($"utc_ts", "Asia/Kolkata"))
    .show(false)

  //  Output:
//  +-------------------+--------+-------------------+-------------------+
//  |timestamp_str      |timezone|utc_ts             |ist_ts             |
//  +-------------------+--------+-------------------+-------------------+
//  |2024-02-10 14:30:00|UTC     |2024-02-10 14:30:00|2024-02-10 20:00:00|
//  +-------------------+--------+-------------------+-------------------+


//8. Group by year-month and calculate average sales.

  val dataframe8 = List(("2024-02-10", 100), ("2024-02-15", 150)).toDF("date", "sales")

  dataframe8.withColumn("date",to_date($"date"))
    .withColumn("year_month", date_format($"date", "yyyy-MM"))
    .groupBy("year_month").agg(avg($"sales").as("Avg_per_year-month")).show()

//  Output:
//  +----------+------------------+
//  |year_month|Avg_per_year-month|
//  +----------+------------------+
//  |   2024-02|             125.0|
//  +----------+------------------+


//9. Filter records where the date is in the last 7 days.

  val dataframe9 = List(("2024-02-10"), ("2024-02-15"), ("2024-02-20")).toDF("date_str")

  dataframe9.withColumn("date",to_date($"date_str"))
    .filter($"date" > date_sub(current_date(),7)).show()

//  Output:
//  +--------+----+
//  |date_str|date|
//  +--------+----+
//  +--------+----+
//
//10. Convert a date to &#39;yyyy/MM/dd  format.
  val dataframe10 = List(("2024-02-10")).toDF("date_str")

  dataframe10.withColumn("formatted_date",
      date_format(to_date($"date_str"), "yyyy/MM/dd"))
    .show(false)

//  Output:
//  +----------+--------------+
//  |date_str  |formatted_date|
//  +----------+--------------+
//  |2024-02-10|2024/02/10    |
//  +----------+--------------+
//
//11. Fill null dates with a default value.
  val dataframe11 = List(("2024-02-10", null), (null, "2024-02-20")).toDF("date1", "date2")
  //Expected Output: Nulls replaced with &quot;2024-01-01&quot;.

  dataframe11.withColumn("toDate1",coalesce(to_date($"date1"),to_date(lit("2024-01-01"))))
    .withColumn("toDate2",coalesce(to_date($"date2"),to_date(lit("2024-01-01"))))
    .show()


//  Output:
//  +----------+----------+----------+----------+
//  |     date1|     date2|   toDate1|   toDate2|
//  +----------+----------+----------+----------+
//  |2024-02-10|      null|2024-02-10|2024-01-01|
//  |      null|2024-02-20|2024-01-01|2024-02-20|
//  +----------+----------+----------+----------+
//
//12. Get the first day of the month for each date.
  val dataframe12 = List(("2024-02-10"), ("2024-03-15")).toDF("date_str")
  //Expected Output: &quot;2024 02-01&quot;, &quot;2024-03-01&quot;.

  dataframe12.withColumn("toDate",to_date($"date_str"))
    .withColumn("Firstday",trunc($"toDate", "month")).show()

//  Output:
//  +----------+----------+----------+
//  |  date_str|    toDate|  Firstday|
//  +----------+----------+----------+
//  |2024-02-10|2024-02-10|2024-02-01|
//  |2024-03-15|2024-03-15|2024-03-01|
//  +----------+----------+----------+
//
//
//13. Find records where the year is a leap year.
  val dataframe13 = List(("2020-02-29"), ("2023-03-01")).toDF("date_str")

  dataframe13.withColumn("toDate",to_date($"date_str"))
    .withColumn("year",year($"toDate"))
    .filter(($"year" % 4 ===0 && $"year" % 100 =!= 0) ||  ($"year" % 400 ===0))
    .select($"toDate")
    .show()


//  Output:
//  +----------+
//  |    toDate|
//  +----------+
//  |2020-02-29|
//  +----------+

//14. Extract quarter from a date.
  val dataframe14 = List(("2024-04-15"), ("2024-07-10")).toDF("date_str")

  dataframe14.withColumn("toDate",to_date($"date_str"))
    .withColumn("quarter",concat(lit("Q"),quarter($"toDate")))
    .show()
//  Output:
//  +----------+----------+-------+
//  |  date_str|    toDate|quarter|
//  +----------+----------+-------+
//  |2024-04-15|2024-04-15|     Q2|
//    |2024-07-10|2024-07-10|     Q3|
//    +----------+----------+-------+
//


//15. Find the next Monday after each date.
  val dataframe15 = List(("2024-02-10")).toDF("date_str")

  dataframe15.withColumn("date", to_date($"date_str"))
    .withColumn("next_monday", next_day($"date", "Monday"))
    .show()

//  Output:
//  +----------+----------+-----------+
//  |  date_str|      date|next_monday|
//  +----------+----------+-----------+
//  |2024-02-10|2024-02-10| 2024-02-12|
//  +----------+----------+-----------+


  //16. Count records per week.
  val dataframe16 = List(("2024-02-10"), ("2024-02-12")).toDF("date_str")

  dataframe16.withColumn("date", to_date($"date_str"))
    .withColumn("Year_Week",concat(year($"date"),lit("-"),weekofyear($"date")))
    .groupBy("Year_Week").agg(count("*").as("count")).show()

//  Output:
//  +---------+-----+
//  |Year_Week|count|
//  +---------+-----+
//  |   2024-6|    1|
//  |   2024-7|    1|
//  +---------+-----+

  //17. Find the date of the previous Friday.
  val dataframe17 = List(("2024-02-10")).toDF("date_str")

  dataframe17.withColumn("date", to_date($"date_str"))
    .withColumn("previous_friday",
      next_day(date_sub($"date", 7), "Friday")
    ).show()

//  Output:
//  +----------+----------+---------------+
//  |  date_str|      date|previous_friday|
//  +----------+----------+---------------+
//  |2024-02-10|2024-02-10|     2024-02-09|
//  +----------+----------+---------------+

  //18. Generate a sequence of dates between 2024-01-01 and 2024-01-10
  val df = spark.sql("""SELECT explode( sequence(to_date('2024-01-01'),to_date('2024-01-10'),interval 1 day)) AS date """)

  df.show()


//  Output:
//  +----------+
//  |      date|
//  +----------+
//  |2024-01-01|
//  |2024-01-02|
//  |2024-01-03|
//  |2024-01-04|
//  |2024-01-05|
//  |2024-01-06|
//  |2024-01-07|
//  |2024-01-08|
//  |2024-01-09|
//  |2024-01-10|
//  +----------+


//19. Find the number of working days between two dates.
//  val dataframe19 = List(("2024-02-01", "2024-02-10")).toDF("start_date", "end_date")



//20. Convert a timestamp to ISO 8601 format.
//  val df20 = List(("2024-02-10 14:30:00")).toDF("timestamp_str")
//Expected Output: &quot;2024 02-10T14:30:00Z&quot;.

//21. Add 1 year, 3 months, and 15 days to a date.
  val df21 = List(("2024-02-10")).toDF("date_str")

  df21.withColumn("toDate",to_date($"date_str"))
    .withColumn("addYear",date_add(add_months($"toDate",15),15)).show()

//  Output:
//  +----------+----------+----------+
//  |  date_str|    toDate|   addYear|
//  +----------+----------+----------+
//  |2024-02-10|2024-02-10|2025-05-25|
//  +----------+----------+----------+

//22. Get the first Monday of each month.
  val df22 = List(("2024-02-10"), ("2024-03-15")).toDF("date_str")

  df22.withColumn("date", to_date($"date_str"))
    .withColumn("first_day", trunc($"date", "month"))
    .withColumn("first_monday", next_day(date_sub($"first_day", 1), "Monday")
    )
    .select("date_str", "first_monday")
    .show()
//  Output:
//  +----------+------------+
//  |  date_str|first_monday|
//  +----------+------------+
//  |2024-02-10|  2024-02-05|
//  |2024-03-15|  2024-03-04|
//  +----------+------------+
//
  //23. Find the last Friday of each month.
  val df23 = List(("2024-02-10"), ("2024-03-15")).toDF("date_str")

  df23.withColumn("date", to_date($"date_str"))
    .withColumn("last_day", last_day($"date"))
    .withColumn("last_friday",
      next_day(date_sub($"last_day", 7), "Friday")
    )
    .select("date_str", "last_friday")
    .show()

//  Output:
//  +----------+-----------+
//  |  date_str|last_friday|
//  +----------+-----------+
//  |2024-02-10| 2024-02-23|
//  |2024-03-15| 2024-03-29|
//  +----------+-----------+

//24. Find how many Mondays fall in a given date range.
  val df24 = List(("2024-01-01", "2024-01-31")).toDF("start_date", "end_date")

  df24.withColumn("date", to_date($"date_str"))

//25. Identify public holidays falling on weekends.


}
