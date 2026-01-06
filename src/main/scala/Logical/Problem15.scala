object Problem15 {
  def main(args: Array[String]): Unit = {
    println("Multiplication Pattern:")
    for (i <- 3 to 15) {
      val result = i * (i + 1)
      println(s"$i * ${i+1} = $result")
    }
  }
}