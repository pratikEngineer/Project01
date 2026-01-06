object Problem20 {
  def main(args: Array[String]): Unit = {
    println("Printing A and B alternately 100 times:")
    for (i <- 1 to 100) {
      if (i % 2 == 1) {
        print("A ")
      } else {
        print("B ")
      }
    }
    println()
  }
}