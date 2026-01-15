object Array12 {
  def main(args: Array[String]): Unit = {
    val arr = Array(25, 60, 45, 80, 33, 90, 10, 55)
    println("Original array: " + arr.mkString(", "))

    val result = arr.map(num => {
      if (num > 50) num - (num * 0.1)
      else num + (num * 0.2)
    })

    println("Modified array: " + result.mkString(", "))
  }
}