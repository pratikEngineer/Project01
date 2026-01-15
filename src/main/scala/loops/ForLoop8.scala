object ForLoop8 {
  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 7, 9)
    var sum = 0
    for (num <- list) {
      sum += num
    }
    println(s"Sum of numbers in list [3, 5, 7, 9]: $sum")
  }
}