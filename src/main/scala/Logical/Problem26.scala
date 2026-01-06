object Problem26 {
  def main(args: Array[String]): Unit = {
    println("Even-Odd label series:")
    for (i <- 1 to 34) {
      if (i % 2 == 1) {
        print(s"$i ")
      } else {
        print("even ")
      }
    }
    println()
  }
}