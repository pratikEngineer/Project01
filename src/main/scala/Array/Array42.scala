object Array42 {
  def main(args: Array[String]): Unit = {
    val arr = Array(4, 4, 5, 6, 7, 5, 6, 6, 6, 7, 8)
    println("Array: " + arr.mkString(", "))

    val frequencyMap = scala.collection.mutable.Map[Int, Int]()

    for (num <- arr) {
      frequencyMap(num) = frequencyMap.getOrElse(num, 0) + 1
    }

    val (mostFrequent, count) = frequencyMap.maxBy(_._2)

    println(s"Most frequently occurring number: $mostFrequent (appears $count times)")
  }
}