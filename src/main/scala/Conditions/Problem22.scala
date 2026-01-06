package Conditions

import scala.io.StdIn

object Problem22 {
  def main(args: Array[String]): Unit = {
    print("Enter purchase amount: ")
    val purchaseAmount = StdIn.readDouble()
    print("Do you have a loyalty card? (true/false): ")
    val loyaltyCard = StdIn.readBoolean()
    val eligible = purchaseAmount > 200 || loyaltyCard
    println(s"Purchase Amount: $purchaseAmount")
    println(s"Loyalty Card: $loyaltyCard")
    println(s"Eligible for discount or membership benefits: $eligible")
  }
}