object ForLoop3 {
  def main(args: Array[String]): Unit = {
    println("Squares of numbers from 1 to 7:")
    for (i <- 1 to 7) {
      println(s"$i² = ${i * i}")
    }
  }
}