object ForLoop2 {
  def main(args: Array[String]): Unit = {
    println("First 5 even numbers:")
    for (i <- 1 to 5) {
      print(s"${i * 2}")
      if (i < 5) print(", ")
    }
    println()
  }
}