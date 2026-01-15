object Array14 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 3, 2, 1)
    println("Array: " + arr.mkString(", "))

    var isPalindrome = true
    var i = 0
    var j = arr.length - 1

    while (i < j) {
      if (arr(i) != arr(j)) {
        isPalindrome = false
      }
      i += 1
      j -= 1
    }

    if (isPalindrome) {
      println("The array is a palindrome")
    } else {
      println("The array is not a palindrome")
    }
  }
}