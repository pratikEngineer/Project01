object Problem19 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (i <- 55 to 95 by 2) {
      sum += i * i
    }
    println(s"Sum of squares (55² + 57² + ... + 95²): $sum")
  }
}