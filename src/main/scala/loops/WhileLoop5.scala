object WhileLoop5 {
  def main(args: Array[String]): Unit = {
    var factorial = 1
    var i = 6
    while (i >= 1) {
      factorial *= i
      i -= 1
    }
    println(s"Factorial of 6: $factorial")
  }
}