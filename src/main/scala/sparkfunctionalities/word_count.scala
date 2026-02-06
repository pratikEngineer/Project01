package sparkfunctionalities

object word_count {
  import org.apache.spark.{SparkConf, SparkContext}

    def main(args: Array[String]): Unit = {

      val conf = new SparkConf()
        .setAppName("WordCount")
        .setMaster("local[*]")

      val sc = new SparkContext(conf)

      // Input data
      val data = List(
        "hello spark",
        "hello scala",
        "spark with scala",
        "hello spark it is"
      )

      // Create RDD
      val rdd = sc.parallelize(data)

      // Word count logic
      val wordCount = rdd
        .flatMap(line => line.split(" "))
        .map(word => (word, 1))
        .reduceByKey(_ + _)

      // Print result
      wordCount.collect().foreach(println)

      sc.stop()
    }


}
