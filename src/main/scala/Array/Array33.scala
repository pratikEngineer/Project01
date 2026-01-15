object Array33 {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 5, 7, 9, 11, 13, 15, 17)
    var product: Long = 1

    for (num <- arr) {
      if (num % 2 != 0) {
        product *= num
      }
    }

    println(s"Product of all odd numbers: $product")
  }
}