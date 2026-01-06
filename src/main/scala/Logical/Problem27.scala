object Problem27 {
  def main(args: Array[String]): Unit = {
    println("Factor of five labeling:")
    for (i <- 1 to 30) {
      if (i % 5 == 0) {
        print("factor of five ")
      } else {
        print(s"$i ")
      }
    }
    println()
  }
}