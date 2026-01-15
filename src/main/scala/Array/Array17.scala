object Array17 {
  def main(args: Array[String]): Unit = {
    val prices = Array(120, 40, 60, 80, 100, 30, 50)
    println("Original prices: " + prices.mkString(", "))

    val itemCount = prices.length
    val discountedPrices = if (itemCount > 5) {
      prices.map(price => price - (price * 0.15))
    } else {
      prices.map(_.toDouble)
    }

    println(s"Number of items: $itemCount")
    println("Discounted prices: " + discountedPrices.mkString(", "))
  }
}