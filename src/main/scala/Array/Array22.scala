import scala.io.StdIn

object Array22 {
  def main(args: Array[String]): Unit = {
    val arr = Array(15, 25, 35, 45, 55, 65, 75, 85)
    print("Enter threshold: ")
    val threshold = StdIn.readInt()

    var count = 0
    for (num <- arr) {
      if (num > threshold) {
        count += 1
      }
    }

    println(s"Count of numbers greater than $threshold: $count")
  }
}