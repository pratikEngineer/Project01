object Problem21 {
  def main(args: Array[String]): Unit = {
    println("Pattern n@(n-1):")
    for (i <- 18 to 1 by -1) {
      println(s"$i@${i-1}")
    }
  }
}