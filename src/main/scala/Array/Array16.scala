object Array16 {
  def main(args: Array[String]): Unit = {
    val prices = Array(150, 200, 50, 80, 120, 95, 300, 400)
    println("Original prices: " + prices.mkString(", "))

    val discountedPrices = prices.map(price => {
      if (price > 100) price - (price * 0.1)
      else price.toDouble
    })

    println("Discounted prices: " + discountedPrices.mkString(", "))
  }
}