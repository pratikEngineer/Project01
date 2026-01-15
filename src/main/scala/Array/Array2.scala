object Array2 {
  def main(args: Array[String]): Unit = {
    val arr = Array(12, 7, 25, 30, 50, 61, 82, 91)
    println("Odd numbers in the array:")
    for (num <- arr) {
      if (num % 2 != 0) {
        println(num)
      }
    }
  }
}