package Conditions

import scala.io.StdIn

object Problem27 {
  def main(args: Array[String]): Unit = {
    print("Enter purchase amount: ")
    val purchaseAmount = StdIn.readDouble()
    val eligible = purchaseAmount > 150 && purchaseAmount > 100
    println(s"Purchase Amount: $purchaseAmount")
    println(s"Eligible for discount and free shipping: $eligible")
  }
}