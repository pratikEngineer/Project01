object ForLoop7 {
  def main(args: Array[String]): Unit = {
    println("Multiplication table of 4:")
    for (i <- 1 to 10) {
      println(s"4 × $i = ${4 * i}")
    }
  }
}