package Conditions

import scala.io.StdIn

object Problem17 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    val eligibleForBoth = age > 60 && age < 25
    println(s"Age: $age")
    println(s"Eligible for both senior and student discount: $eligibleForBoth")
  }
}