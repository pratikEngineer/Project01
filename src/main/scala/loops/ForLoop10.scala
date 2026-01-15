import scala.io.StdIn

object ForLoop10 {
  def main(args: Array[String]): Unit = {
    val str = "scala"
    print("Enter a character to search: ")
    val ch = StdIn.readChar()

    var found = false
    for (c <- str) {
      if (c == ch) {
        found = true
      }
    }

    if (found) {
      println(s"Character '$ch' is present in '$str'")
    } else {
      println(s"Character '$ch' is not present in '$str'")
    }
  }
}