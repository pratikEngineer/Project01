object Problem31 {
  def main(args: Array[String]): Unit = {
    println("Nested loops execution flow:")
    for (outer <- 1 to 3) {
      println(s"Outer loop iteration: $outer")
      for (inner <- 1 to 2) {
        println(s"  Inner loop iteration: $inner")
        println(s"  Outer=$outer, Inner=$inner")
      }
      println()
    }
  }
}