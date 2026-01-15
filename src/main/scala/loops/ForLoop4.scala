object ForLoop4 {
  def main(args: Array[String]): Unit = {
    val word = "HELLO"
    println("Characters of HELLO:")
    for (ch <- word) {
      println(ch)
    }
  }
}