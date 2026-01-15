object Pattern2 {
  def main(args: Array[String]): Unit = {
    println("Pattern using while loop:")
    var i = 1
    while (i <= 4) {
      var j = 1
      while (j <= i) {
        print(j)
        j += 1
      }
      println()
      i += 1
    }
  }
}