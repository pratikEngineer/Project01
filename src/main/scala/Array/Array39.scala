object Array39 {
  def main(args: Array[String]): Unit = {
    val prices = Array(80, 150, 220, 90, 350, 500, 100)
    println("Original prices: " + prices.mkString(", "))

    val discountedPrices = prices.map(price => {
      if (price < 100) price - (price * 0.05)
      else if (price >= 100 && price <= 300) price - (price * 0.10)
      else price - (price * 0.15)
    })

    println("Discounted prices: " + discountedPrices.mkString(", "))
  }
}