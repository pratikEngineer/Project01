object Pattern1 {
  def main(args: Array[String]): Unit = {
    println("Pattern using for loop:")
    for (i <- 1 to 4) {
      for (j <- 1 to i) {
        print("#")
      }
      println()
    }
  }
}
