package Conditions

import scala.io.StdIn

object Problem21 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isDivisibleBy3And5 = number % 3 == 0 && number % 5 == 0
    println(s"Number: $number")
    println(s"Is divisible by 3 and 5: $isDivisibleBy3And5")
  }
}