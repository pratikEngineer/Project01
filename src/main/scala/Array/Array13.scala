object Array13 {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(11, 22, 37, 44, 53, 61, 72, 88)
    println("Original array: " + arr.mkString(", "))

    val result = arr.map(num => {
      if (isPrime(num)) -1
      else num
    })

    println("Modified array: " + result.mkString(", "))
  }
}