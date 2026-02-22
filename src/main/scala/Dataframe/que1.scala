import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object SparkConditionalColumns {
  def main(args: Array[String]): Unit = {

    // Create Spark Session
    val spark = SparkSession.builder()
      .appName("Conditional Columns Examples")
      .master("local[4]")
      .getOrCreate()

//   Question 1: Conditional Column
//
//    val employees = List(
//      (1, "AJAY", 28),
//      (2, "VIJAY", 35),
//      (3, "MANOJ", 22)
//    ).toDF("id", "name", "age")
//
//    val employees1 = employees.withColumn("is_adult", col("age") >= 18)
//    employees1.show()


    val employees2 = List(
      (1, "Ajay", 28),
      (2, "Vijay", 35),
      (3, "Manoj", 22)
    ).toDF("id", "name", "age")
    val result = employees2.withColumn("is_adult", when(col("age") > 18, True).otherwise(False))
        result.show()

  }
}

