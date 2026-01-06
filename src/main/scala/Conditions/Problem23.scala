package Conditions

import scala.io.StdIn

object Problem23 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy2Or3 = number % 2 == 0 || number % 3 == 0
    println(s"Number: $number")
    println(s"Is divisible by 2 or 3: $isDivisibleBy2Or3")
  }
}