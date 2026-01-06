package Conditions

import scala.io.StdIn

object Problem1 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isEvenAndPositive = number > 0 && number % 2 == 0
    println(s"Number: $number")
    println(s"Is even and positive: $isEvenAndPositive")
  }
}
