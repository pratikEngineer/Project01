package Conditions

import scala.io.StdIn

object Problem5 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    val canVoteOrDrive = age >= 18 || age >= 16
    println(s"Age: $age")
    println(s"Can vote or drive: $canVoteOrDrive")
  }
}