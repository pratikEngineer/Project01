object Problem8 {
  def main(args: Array[String]): Unit = {
    println("Numbers divisible by 14 from 120 to 360:")
    for (i <- 120 to 360) {
      if (i % 14 == 0) {
        println(i)
      }
    }
  }
}