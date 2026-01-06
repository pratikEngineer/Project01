package Conditions

import scala.io.StdIn

object Problem3 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isOddAndNotDivisibleBy3 = number % 2 != 0 && number % 3 != 0
    println(s"Number: $number")
    println(s"Is odd and not divisible by 3: $isOddAndNotDivisibleBy3")
  }
}