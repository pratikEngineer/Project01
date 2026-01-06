object Problem30 {
  def main(args: Array[String]): Unit = {
    println("Infinite loop (Press Ctrl+C to stop):")
    var count = 0
    while (true) {
      count += 1
      println(s"Iteration: $count")
      Thread.sleep(1000) // Sleep for 1 second
    }
  }
}