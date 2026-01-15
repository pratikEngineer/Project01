object ForLoop11 {
  def main(args: Array[String]): Unit = {
    val str = "hello"
    println("Even-indexed characters in 'hello':")
    for (i <- 0 until str.length by 2) {
      print(s"${str(i)}")
      if (i < str.length - 2) print(", ")
    }
    println()
  }
}