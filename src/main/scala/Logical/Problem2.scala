import scala.io.StdIn

object Problem2 {
  def main(args: Array[String]): Unit = {
    print("Enter temperature in Celsius: ")
    val celsius = StdIn.readDouble()
    val fahrenheit = (celsius * 9/5) + 32
    println(s"$celsius°C = $fahrenheit°F")
  }
}