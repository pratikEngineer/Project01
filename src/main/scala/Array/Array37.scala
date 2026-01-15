object Array37 {
  def main(args: Array[String]): Unit = {
    val prices = Array(120, 80, 40, 200, 300)
    println("Original prices: " + prices.mkString(", "))

    val itemCount = prices.length
    val discountedPrices = if (itemCount == 3) {
      prices.map(price => price - (price * 0.1))
    } else {
      prices.map(_.toDouble)
    }

    println(s"Number of items: $itemCount")
    println("Prices after discount: " + discountedPrices.mkString(", "))
  }
}