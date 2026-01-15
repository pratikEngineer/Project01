object Array25 {
  def main(args: Array[String]): Unit = {
    val arr = Array(4, 8, 12, 16, 20, 24, 28, 32)
    var sum = 0

    for (i <- arr.indices) {
      if (i % 2 != 0) {
        sum += arr(i)
      }
    }

    println(s"Sum of numbers at odd indices: $sum")
  }
}