object WhileLoop9 {
  def main(args: Array[String]): Unit = {
    println("Numbers from 1 to 20 (skipping divisible by 3):")
    var i = 1
    while (i <= 20) {
      if (i % 3 != 0) {
        println(i)
      }
      i += 1
    }
  }
}