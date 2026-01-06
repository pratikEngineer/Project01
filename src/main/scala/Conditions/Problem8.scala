package Conditions

import scala.io.StdIn

object Problem8 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    val eligibleForDiscount = age > 60 || age < 25
    println(s"Age: $age")
    println(s"Eligible for senior or student discount: $eligibleForDiscount")
  }
}