object Array24 {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 7, 11, 15, 19, 23, 27, 31)
    var sum = 0

    for (i <- arr.indices) {
      if (i % 2 == 0) {
        sum += arr(i)
      }
    }

    println(s"Sum of numbers at even indices: $sum")
  }
}