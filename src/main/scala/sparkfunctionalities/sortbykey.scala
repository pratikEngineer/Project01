package sparkfunctionalities

import org.apache.spark.{SparkConf, SparkContext}

  object sortbykey {

    def main(args: Array[String]): Unit = {

      // 1️⃣ Create Spark configuration
      val conf = new SparkConf()
        .setAppName("IPAnalysis")
        .setMaster("local[*]")

      // 2️⃣ Create SparkContext
      val sc = new SparkContext(conf)

      // 3️⃣ Input data
      val data = List(
        "168.182.0.1.1","168.182.0.1.2","168.182.0.1.1","168.182.0.1.3",
        "168.182.0.1.2","168.182.0.1.1","168.182.0.1.3","168.182.0.1.4",
        "168.182.0.1.3","168.182.0.1.1","168.182.0.1.3","168.182.0.1.2",
        "168.182.0.1.4","168.182.0.1.1","168.182.0.1.2","168.182.0.1.1"
      )

      // 4️⃣ Create RDD
      val rdd = sc.parallelize(data)

      // 5️⃣ Convert to (ip,1)
      val pairRDD = rdd.map(x => (x, 1))

      // 6️⃣ reduceByKey
      val countRDD = pairRDD.reduceByKey(_ + _)

      // 7️⃣ sortByKey
      val sortByKeyRDD = countRDD.sortByKey()

      // 8️⃣ sortBy count descending
      val sortByCountRDD = countRDD.sortBy(_._2, ascending = false)

      // 9️⃣ groupByKey
      val groupByKeyRDD = pairRDD.groupByKey().mapValues(_.sum)

      // 🔟 Second highest IP
      val secondHighest = sortByCountRDD.take(2)(1)

      // 🔍 Output
      println("Counts: " + countRDD.collect().toList)
      println("Sorted by count: " + sortByCountRDD.collect().toList)
      println("Second highest IP: " + secondHighest)

      // 1️⃣1️⃣ Stop Spark
      sc.stop()
    }


}
