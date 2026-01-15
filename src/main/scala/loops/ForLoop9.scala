object ForLoop9 {
  def main(args: Array[String]): Unit = {
    val str = "education"
    val vowels = "aeiouAEIOU"
    println("Vowels in 'education':")
    for (ch <- str) {
      if (vowels.contains(ch)) {
        println(ch)
      }
    }
  }
}