object Problem24 {
  def main(args: Array[String]): Unit = {
    println("Alternating values series (7 times):")
    for (i <- 1 to 7) {
      if (i % 2 == 1) {
        print("6 ")
      } else {
        print("12 ")
      }
    }
    println()
  }
}