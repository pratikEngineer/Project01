object Array31 {
  def main(args: Array[String]): Unit = {
    val arr = Array(15, 30, 45, 60, 75, 90, 105, 120)
    var count = 0

    for (num <- arr) {
      if (num % 3 == 0 && num % 5 == 0) {
        count += 1
      }
    }

    println(s"Count of numbers divisible by both 3 and 5: $count")
  }
}