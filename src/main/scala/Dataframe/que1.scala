import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object SparkConditionalColumns {
  def main(args: Array[String]): Unit = {

    // Create Spark Session
    val spark = SparkSession.builder()
      .appName("Conditional Columns Examples")
      .master("local[4]")
      .getOrCreate()

    import spark.implicits._

    println("=" * 60)
    println("SIMPLE QUESTIONS")
    println("=" * 60)

    // Question 1: Conditional Column
    println("\n1. Conditional Column (is_adult)")
    val employees = List(
      (1, "AJAY", 28),
      (2, "VIJAY", 35),
      (3, "MANOJ", 22)
    ).toDF("id", "name", "age")

    val employees1 = employees.withColumn("is_adult", col("age") >= 18)
    employees1.show()

  }
}