package Conditions

import scala.io.StdIn

object Problem4 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy4Or6 = number % 4 == 0 || number % 6 == 0
    println(s"Number: $number")
    println(s"Is divisible by 4 or 6: $isDivisibleBy4Or6")
  }
}