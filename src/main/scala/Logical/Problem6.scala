import scala.io.StdIn

object Problem6 {
  def main(args: Array[String]): Unit = {
    print("Enter first number: ")
    val a = StdIn.readDouble()
    print("Enter second number: ")
    val b = StdIn.readDouble()
    print("Enter operator (+, -, *, /, %): ")
    val op = StdIn.readLine()

    val result = op match {
      case "+" => a + b
      case "-" => a - b
      case "*" => a * b
      case "/" => if (b != 0) a / b else {
        println("Cannot divide by zero")
        return
      }
      case "%" => a % b
      case _ => {
        println("Invalid operator")
        return
      }
    }

    println(s"$a $op $b = $result")
  }
}