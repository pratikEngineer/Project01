package Conditions

import scala.io.StdIn

object Problem15 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    val ageGroup = if (age < 13) "child"
    else if (age >= 13 && age <= 19) "teen"
    else "adult"
    println(s"Age: $age")
    println(s"Age Group: $ageGroup")
  }
}