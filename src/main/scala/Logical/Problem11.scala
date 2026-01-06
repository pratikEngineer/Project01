object Problem11 {
  def main(args: Array[String]): Unit = {
    println("Odd numbers from 401 to 201 (reverse):")
    for (i <- 401 to 201 by -1) {
      if (i % 2 != 0) {
        println(i)
      }
    }
  }
}