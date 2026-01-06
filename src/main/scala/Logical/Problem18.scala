object Problem18 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var count = 0
    for (i <- 28 to 96 by 2) {
      sum += i
      count += 1
    }
    val average = sum.toDouble / count
    println(s"Average of series (28, 30, 32, ..., 96): $average")
  }
}