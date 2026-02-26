import org.apache.zookeeper.Environment.list

object ForLoop1 {
  def main(args: Array[String]): Unit = {
//    println("Numbers from 1 to 10:")
//    for (i <- 1 to 10) {
//      println(i)
val num = List(1,2,3,4)
    for(n <- num ) {
      if(n % 2 == 0) {
        println("even")
      } else
        println("odd")
    }
  }

}

//import org.apache.spark.sql.SparkSession
//import org.apache.spark.sql.functions._
//import org.apache.spark.sql.types._
//
//object ConditionalColumnsDemo {
//
//  def main(args: Array[String]): Unit = {
//
//    val spark = SparkSession.builder()
//      .appName("Conditional Columns Practice")
//      .master("local[*]")
//      .getOrCreate()
//
//    import spark.implicits._
//
//
//
//
//
//
//
//    spark.stop()
//  }
//}
//ihshsfhii