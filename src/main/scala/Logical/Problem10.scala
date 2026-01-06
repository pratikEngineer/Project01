object Problem10 {
  def main(args: Array[String]): Unit = {
    println("Even numbers from 350 to 500:")
    for (i <- 350 to 500) {
      if (i % 2 == 0) {
        println(i)
      }
    }
  }
}