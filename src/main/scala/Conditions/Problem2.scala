package Conditions

import scala.io.StdIn

object Problem2 {
  def main(args: Array[String]): Unit = {
    print("Enter a value: ")
    val value = StdIn.readInt()
    val isOutOfRange = value < -10 || value > 10
    println(s"Value: $value")
    println(s"Is less than -10 or greater than 10: $isOutOfRange")
  }
}
