import scala.io.StdIn

object Array43 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print("Enter target sum: ")
    val target = StdIn.readInt()

    println(s"Pairs with sum $target:")
    for (i <- arr.indices) {
      for (j <- i + 1 until arr.length) {
        if (arr(i) + arr(j) == target) {
          println(s"(${arr(i)}, ${arr(j)})")
        }
      }
    }
  }
}