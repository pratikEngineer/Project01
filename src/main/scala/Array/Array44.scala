object Array44 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 0, 2, 3, 0, 4, 0, 5, 6, 0)
    println("Original array: " + arr.mkString(", "))

    val result = new Array[Int](arr.length)
    var index = 0

    for (num <- arr) {
      if (num != 0) {
        result(index) = num
        index += 1
      }
    }

    while (index < arr.length) {
      result(index) = 0
      index += 1
    }

    println("Modified array: " + result.mkString(", "))
  }
}