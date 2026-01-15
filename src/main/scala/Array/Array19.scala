object Array19 {
  def main(args: Array[String]): Unit = {
    val items = Array(("Laptop", 1000), ("Milk", 50), ("Mobile", 500), ("Eggs", 30))
    val electronics = Set("Laptop", "Mobile", "TV", "Phone")

    println("Original items and prices:")
    items.foreach { case (name, price) => println(s"$name: $price") }

    val updatedItems = items.map { case (name, price) =>
      val newPrice = if (electronics.contains(name)) {
        price + (price * 0.05)
      } else {
        price + (price * 0.03)
      }
      (name, newPrice)
    }

    println("\nUpdated items and prices:")
    updatedItems.foreach { case (name, price) => println(f"$name: $price%.2f") }
  }
}