package Conditions

import scala.io.StdIn

object Problem20 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isOddAndNotDivisibleBy4 = number % 2 != 0 && number % 4 != 0
    println(s"Number: $number")
    println(s"Is odd and not divisible by 4: $isOddAndNotDivisibleBy4")
  }
}