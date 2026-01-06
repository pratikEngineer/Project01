object Problem17 {
  def main(args: Array[String]): Unit = {
    println("Lowercase alphabets:")
    for (ch <- 'a' to 'z') {
      print(s"$ch ")
    }
    println()

    println("Uppercase alphabets:")
    for (ch <- 'A' to 'Z') {
      print(s"$ch ")
    }
    println()
  }
}