package Conditions

import scala.io.StdIn

object Problem10 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isNonNegativeOrEven = number >= 0 || number % 2 == 0
    println(s"Number: $number")
    println(s"Is non-negative or even: $isNonNegativeOrEven")
  }
}