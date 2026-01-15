object WhileLoop6 {
  def main(args: Array[String]): Unit = {
    val str = "code"
    var reversed = ""
    var i = str.length - 1
    while (i >= 0) {
      reversed += str(i)
      i -= 1
    }
    println(s"Original: $str")
    println(s"Reversed: $reversed")
  }
}