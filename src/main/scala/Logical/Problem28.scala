object Problem28 {
  def main(args: Array[String]): Unit = {
    println("Divisible by 4 label:")
    for (i <- 1 to 25) {
      if (i % 4 == 0) {
        print("divisible by 4 ")
      } else {
        print(s"$i ")
      }
    }
    println()
  }
}