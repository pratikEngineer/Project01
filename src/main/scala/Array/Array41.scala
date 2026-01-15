object Array41 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 5, 6, 7, 8, 9, 10)
    val n = 10

    val expectedSum = n * (n + 1) / 2
    val actualSum = arr.sum
    val missing = expectedSum - actualSum

    println("Array: " + arr.mkString(", "))
    println(s"Missing number: $missing")
  }
}