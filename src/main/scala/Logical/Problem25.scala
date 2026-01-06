object Problem25 {
  def main(args: Array[String]): Unit = {
    println("Decreasing multiplication pattern:")
    for (i <- 4 to -10 by -1) {
      val result = 6 * i
      println(s"6 * $i = $result")
    }
  }
}