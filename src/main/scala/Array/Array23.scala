import scala.io.StdIn

object Array23 {
  def main(args: Array[String]): Unit = {
    val arr = Array(9, 18, 27, 36, 45, 54, 63, 72)
    print("Enter number to check: ")
    val search = StdIn.readInt()

    var exists = false
    for (num <- arr) {
      if (num == search) {
        exists = true
      }
    }

    if (exists) {
      println(s"Number $search exists in the array")
    } else {
      println(s"Number $search does not exist in the array")
    }
  }
}