object Problem9 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    for (i <- 60 to 170) {
      sum += i
    }
    println(s"Sum of numbers from 60 to 170: $sum")
  }
}