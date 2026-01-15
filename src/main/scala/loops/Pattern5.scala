object Pattern5 {
  def main(args: Array[String]): Unit = {
    println("Numbers from 1 to 10 (skip 5 and 6):")
    for (i <- 1 to 10) {
      if (i != 5 && i != 6) {
        println(i)
      }
    }
  }
}