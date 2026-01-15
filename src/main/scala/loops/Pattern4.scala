object Pattern4 {
  def main(args: Array[String]): Unit = {
    println("Numbers from 1 to 30 (break at 17):")
    var i = 1
    var continue = true
    while (i <= 30 && continue) {
      if (i == 17) {
        continue = false
      } else {
        println(i)
        i += 1
      }
    }
    println("Loop stopped at 17")
  }
}