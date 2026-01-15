object Array45 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 20, 30, 40, 50, 60, 70, 80)
    println("Array: " + arr.mkString(", "))

    var isSorted = true
    for (i <- 0 until arr.length - 1) {
      if (arr(i) > arr(i + 1)) {
        isSorted = false
      }
    }

    if (isSorted) {
      println("The array is sorted in ascending order")
    } else {
      println("The array is not sorted in ascending order")
    }
  }
}