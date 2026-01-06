package Conditions

import scala.io.StdIn

object Problem6 {
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isInRange = (number >= 1 && number <= 10) || (number >= 20 && number <= 30)
    println(s"Number: $number")
    println(s"Is in range [1,10] or [20,30]: $isInRange")
  }
}