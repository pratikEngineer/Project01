package Logical

object Problem1 {

  def main(args:Array[String]): Unit ={
  val num = List(1,2,3,4,5,6)
  val even=num.filter(_%2==0)
  val odd=num.filter(_%2!=0)

  print("Even numbers:"+even)
  print("odd numbers:"+odd)
  }



}