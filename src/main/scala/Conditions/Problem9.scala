package Conditions

import scala.io.StdIn

object Problem9 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy5And7 = number % 5 == 0 && number % 7 == 0
    println(s"Number: $number")
    println(s"Is divisible by 5 and 7: $isDivisibleBy5And7")
  }
}