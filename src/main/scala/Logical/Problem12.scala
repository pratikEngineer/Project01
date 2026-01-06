object Problem12 {
  def main(args: Array[String]): Unit = {
    var count = 0
    for (i <- 45 to 145) {
      if (i % 2 == 0) {
        count += 1
      }
    }
    println(s"Count of even numbers between 45 and 145: $count")
  }
}