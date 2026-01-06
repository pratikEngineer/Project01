object Problem29 {
  def main(args: Array[String]): Unit = {
    println("Floating point square series:")
    var num = 0.6
    while (num <= 4.6) {
      val square = num * num
      println(f"$num%.1f² = $square%.2f")
      num += 0.2
    }
  }
}