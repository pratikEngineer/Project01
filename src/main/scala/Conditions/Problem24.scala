package Conditions

import scala.io.StdIn

object Problem24 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isPositiveAndNotDivisibleBy3 = number > 0 && number % 3 != 0
    println(s"Number: $number")
    println(s"Is positive and not divisible by 3: $isPositiveAndNotDivisibleBy3")
  }
}