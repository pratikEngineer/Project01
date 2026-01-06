import scala.io.StdIn

object Problem3 {
  def main(args: Array[String]): Unit = {
    print("Enter first number: ")
    val x = StdIn.readInt()
    print("Enter second number: ")
    val y = StdIn.readInt()
    print("Enter third number: ")
    val z = StdIn.readInt()

    val largest = if (x >= y && x >= z) x
    else if (y >= x && y >= z) y
    else z

    println(s"Numbers: x=$x, y=$y, z=$z")
    println(s"Largest number: $largest")
  }
}