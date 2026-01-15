object ForLoop6 {
  def main(args: Array[String]): Unit = {
    println("Numbers from 10 to 1 (reverse):")
    for (i <- 10 to 1 by -1) {
      println(i)
    }
  }
}