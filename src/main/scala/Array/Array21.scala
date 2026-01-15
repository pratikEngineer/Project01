import scala.io.StdIn

object Array21 {
  def main(args: Array[String]): Unit = {
    val arr = Array(10, 20, 30, 40, 50, 60, 70, 80)
    print("Enter number to search: ")
    val search = StdIn.readInt()

    var index = -1
    for (i <- arr.indices) {
      if (arr(i) == search) {
        index = i
      }
    }

    if (index != -1) {
      println(s"Number $search found at index $index")
    } else {
      println(s"Number $search not found (returned -1)")
    }
  }
}