object Array4 {
  def main(args: Array[String]): Unit = {
    val arr = Array(98, 34, 76, 21, 89, 45, 67, 102)
    var max = arr(0)
    var min = arr(0)

    for (num <- arr) {
      if (num > max) max = num
      if (num < min) min = num
    }

    println(s"Maximum: $max")
    println(s"Minimum: $min")
  }
}