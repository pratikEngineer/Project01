package Conditions

import scala.io.StdIn

object Problem28 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isNonNegativeAndNotDivisibleBy7 = number >= 0 && number % 7 != 0
    println(s"Number: $number")
    println(s"Is non-negative and not divisible by 7: $isNonNegativeAndNotDivisibleBy7")
  }
}