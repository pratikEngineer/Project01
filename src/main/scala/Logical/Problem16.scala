object Problem16 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (i <- 280 to 480) {
      if (i % 2 == 0) {
        sum += i
      }
    }
    println(s"Sum of even numbers from 280 to 480: $sum")
  }
}