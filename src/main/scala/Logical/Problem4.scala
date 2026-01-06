import scala.io.StdIn

object Problem4 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()

    if (number < 150 || number > 950) {
      println("Invalid number")
    } else {
      if (number % 2 == 0) {
        val remainder = number % 4
        println(s"$number is even")
        println(s"Remainder when divided by 4: $remainder")
      } else {
        val remainder = number % 3
        println(s"$number is odd")
        println(s"Remainder when divided by 3: $remainder")
      }
    }
  }
}