package Conditions

import scala.io.StdIn

object Problem25 {
  def main(args: Array[String]): Unit = {
    print("Enter age: ")
    val age = StdIn.readInt()
    print("Are you a new customer? (true/false): ")
    val newCustomer = StdIn.readBoolean()
    val eligible = age > 65 && !newCustomer
    println(s"Age: $age")
    println(s"New Customer: $newCustomer")
    println(s"Eligible for senior discount (not new customer): $eligible")
  }
}