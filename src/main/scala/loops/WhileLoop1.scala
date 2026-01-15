object WhileLoop1 {
  def main(args: Array[String]): Unit = {
    println("Numbers from 5 to 1:")
    var i = 5
    while (i >= 1) {
      println(i)
      i -= 1
    }
  }
}