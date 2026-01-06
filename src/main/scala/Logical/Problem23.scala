object Problem23 {
  def main(args: Array[String]): Unit = {
    println("Odd squares series:")
    for (i <- 13 to 29 by 2) {
      println(s"$i² = ${i*i}")
    }
  }
}