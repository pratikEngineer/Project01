package Conditions

import scala.io.StdIn

object Problem19 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy5Or9 = number % 5 == 0 || number % 9 == 0
    println(s"Number: $number")
    println(s"Is divisible by 5 or 9: $isDivisibleBy5Or9")
  }
}