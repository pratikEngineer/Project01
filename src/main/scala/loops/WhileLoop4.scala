object WhileLoop4 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var i = 1
    while (i <= 20) {
      sum += i
      i += 1
    }
    println(s"Sum of numbers from 1 to 20: $sum")
  }
}