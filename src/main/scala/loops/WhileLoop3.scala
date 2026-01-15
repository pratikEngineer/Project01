object WhileLoop3 {
  def main(args: Array[String]): Unit = {
    val str = "Education"
    println("Characters of 'Education':")
    var i = 0
    while (i < str.length) {
      println(str(i))
      i += 1
    }
  }
}