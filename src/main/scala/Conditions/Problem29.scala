package Conditions

import scala.io.StdIn

object Problem29 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    print("Do you have a free trial? (true/false): ")
    val freeTrial = StdIn.readBoolean()
    val eligible = age < 25 || freeTrial
    println(s"Age: $age")
    println(s"Free Trial: $freeTrial")
    println(s"Eligible for student discount or free trial: $eligible")
  }
}