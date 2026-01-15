object Array32 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 25, 30, 45, 50, 65, 70, 85)
    println("Original array: " + arr.mkString(", "))

    val result = arr.map(num => {
      if (num % 10 == 0) -1
      else num
    })

    println("Modified array: " + result.mkString(", "))
  }
}