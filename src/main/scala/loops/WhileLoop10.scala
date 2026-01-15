object WhileLoop10 {
  def main(args: Array[String]): Unit = {
    println("Square of even numbers from 2 to 10:")
    var i = 2
    while (i <= 10) {
      println(s"$i² = ${i * i}")
      i += 2
    }
  }
}