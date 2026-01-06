package Conditions

import scala.io.StdIn

object Problem11 {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = StdIn.readInt()
    val isPrimeAndOdd = isPrime(number) && number % 2 != 0
    println(s"Number: $number")
    println(s"Is prime and odd: $isPrimeAndOdd")
  }
}