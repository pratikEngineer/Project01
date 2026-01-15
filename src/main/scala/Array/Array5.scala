object Array5 {
  def main(args: Array[String]): Unit = {
    val arr = Array(-12, 20, -35, 40, -55, 60, -71, 80)
    var positiveCount = 0
    var negativeCount = 0

    for (num <- arr) {
      if (num > 0) positiveCount += 1
      else if (num < 0) negativeCount += 1
    }

    println(s"Positive numbers: $positiveCount")
    println(s"Negative numbers: $negativeCount")
  }
}