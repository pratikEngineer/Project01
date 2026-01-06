package Conditions

import scala.io.StdIn

object Problem18 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isMultipleOf3And7 = number % 3 == 0 && number % 7 == 0
    println(s"Number: $number")
    println(s"Is multiple of 3 and 7: $isMultipleOf3And7")
  }
}