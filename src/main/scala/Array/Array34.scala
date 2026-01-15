object Array34 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 20, 30, 40, 50, 60, 70, 80)
    println("Original array: " + arr.mkString(", "))

    val result = new Array[Int](arr.length)

    for (i <- arr.indices) {
      if (i == 0) {
        result(i) = arr(i + 1) - 0  // No left neighbor
      } else if (i == arr.length - 1) {
        result(i) = 0 - arr(i - 1)  // No right neighbor
      } else {
        result(i) = arr(i + 1) - arr(i - 1)
      }
    }

    println("Modified array: " + result.mkString(", "))
  }
}