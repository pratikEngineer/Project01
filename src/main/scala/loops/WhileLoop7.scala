import scala.io.StdIn

object WhileLoop7 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    var number = StdIn.readInt()
    val original = number
    var count = 0

    if (number == 0) {
      count = 1
    } else {
      if (number < 0) number = -number
      while (number > 0) {
        count += 1
        number /= 10
      }
    }

    println(s"Number of digits in $original: $count")
  }
}