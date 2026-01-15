object Array40 {
  def main(args: Array[String]): Unit = {
    val prices = Array(120, 130, 100, 200, 50, 60)
    println("Prices: " + prices.mkString(", "))

    val total = prices.sum
    val shipping = if (total > 500) 0 else 20
    val finalTotal = total + shipping

    println(s"Subtotal: $total")
    println(s"Shipping charge: $shipping")
    println(s"Final total: $finalTotal")
  }
}