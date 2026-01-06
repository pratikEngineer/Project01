import scala.io.StdIn

object Problem1 {
  def main(args: Array[String]): Unit = {
    print("Enter weight in kilograms: ")
    val kg = StdIn.readDouble()
    val grams = kg * 1000
    println(s"$kg kg = $grams g")
  }
}