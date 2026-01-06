package Conditions

import scala.io.StdIn

object Problem13 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy3Or8 = number % 3 == 0 || number % 8 == 0
    println(s"Number: $number")
    println(s"Is divisible by 3 or 8: $isDivisibleBy3Or8")
  }
}