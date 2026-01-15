object Array35 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 5, 10, 25, 30, 45, 50, 8, 99, 100)
    var count = 0

    for (num <- arr) {
      if (num >= 10) {
        count += 1
      }
    }

    println(s"Count of numbers with at least two digits: $count")
  }
}