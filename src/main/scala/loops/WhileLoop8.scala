object WhileLoop8 {
  def main(args: Array[String]): Unit = {
    val list = List(5, 10, 15, 20, 25)
    println("Elements of the list:")
    var i = 0
    while (i < list.length) {
      println(list(i))
      i += 1
    }
  }
}