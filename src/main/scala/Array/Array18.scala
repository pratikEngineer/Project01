object Array18 {
  def main(args: Array[String]): Unit = {
    val prices = Array(250, 500, 750, 300, 100, 800, 900)
    println("Original prices: " + prices.mkString(", "))

    val modifiedPrices = prices.map(price => {
      if (price > 500) 0
      else price
    })

    println("Modified prices (free items): " + modifiedPrices.mkString(", "))
  }
}