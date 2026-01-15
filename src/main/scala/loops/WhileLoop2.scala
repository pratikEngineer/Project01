object WhileLoop2 {
  def main(args: Array[String]): Unit = {
    println("First 6 odd numbers:")
    var count = 0
    var num = 1
    while (count < 6) {
      print(num)
      if (count < 5) print(", ")
      num += 2
      count += 1
    }
    println()
  }
}