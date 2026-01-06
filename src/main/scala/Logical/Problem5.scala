import scala.io.StdIn

object Problem5 {
  def main(args: Array[String]): Unit = {
    print("Enter score: ")
    val score = StdIn.readInt()

    if (score < 0 || score > 100) {
      println("Invalid input")
    } else if (score >= 90) {
      println("Genius")
    } else if (score >= 80) {
      println("Excellent")
    } else if (score >= 70) {
      println("Very Good")
    } else if (score >= 60) {
      println("Good")
    } else if (score >= 40) {
      println("Average")
    } else {
      println("Fail")
    }
  }
}