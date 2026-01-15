object Array20 {
  def main(args: Array[String]): Unit = {
    val prices = Array(150, 200, 250, 300, 400, 50, 100)
    println("Prices: " + prices.mkString(", "))

    val total = prices.sum
    val finalTotal = if (total > 1000) total - 100 else total

    println(s"Total before discount: $total")
    println(s"Final total: $finalTotal")
  }
}