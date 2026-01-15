object Array15 {
  def main(args: Array[String]): Unit = {
    val arr = Array(3, 14, 27, 40, 55, 68, 71, 89)
    println("Original array: " + arr.mkString(", "))

    val result = arr.map(num => {
      if (num % 2 == 0) 1
      else 0
    })

    println("Modified array: " + result.mkString(", "))
  }
}