object Array3 {
  def main(args: Array[String]): Unit = {
    val arr = Array(5, 15, 25, 35, 45, 55, 65, 75)
    var sum = 0
    for (num <- arr) {
      sum += num
    }
    println(s"Sum of all elements: $sum")
  }
}