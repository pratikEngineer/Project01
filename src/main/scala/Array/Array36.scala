object Array36 {
  def main(args: Array[String]): Unit = {
    val prices = Array(150, 220, 180, 90, 300, 50, 400)
    println("Original prices: " + prices.mkString(", "))

    val modifiedPrices = prices.map(price => {
      if (price < 200) price + (price * 0.2)
      else price - (price * 0.1)
    })

    println("Modified prices: " + modifiedPrices.mkString(", "))
  }
}