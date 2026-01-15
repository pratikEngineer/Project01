object Array38 {
  def main(args: Array[String]): Unit = {
    val prices = Array(100, 150, 200, 250, 300, 350)
    println("Original prices: " + prices.mkString(", "))

    val sortedPrices = prices.sorted
    var total = 0.0

    for (i <- sortedPrices.indices) {
      if ((i + 1) % 3 != 0) {  // Every 3rd item is free
        total += sortedPrices(i)
      }
    }

    println(s"Total price after Buy 2 Get 1 Free: $total")
    println(s"Original total: ${prices.sum}")
  }
}