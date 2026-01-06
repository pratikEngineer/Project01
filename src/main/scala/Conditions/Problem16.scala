package Conditions

import scala.io.StdIn

object Problem16 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy2Or5 = number % 2 == 0 || number % 5 == 0
    println(s"Number: $number")
    println(s"Is divisible by 2 or 5: $isDivisibleBy2Or5")
  }
}