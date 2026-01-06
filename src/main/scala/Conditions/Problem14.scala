package Conditions

import scala.io.StdIn

object Problem14 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isNonPositiveAndEven = number <= 0 && number % 2 == 0
    println(s"Number: $number")
    println(s"Is non-positive and even: $isNonPositiveAndEven")
  }
}