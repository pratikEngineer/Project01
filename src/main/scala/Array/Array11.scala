object Array11 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 15, 18, 22, 35, 40, 50, 55)
    println("Original array: " + arr.mkString(", "))

    val result = arr.map(num => {
      if (num % 5 == 0) num * 2
      else num + 3
    })

    println("Modified array: " + result.mkString(", "))
  }
}