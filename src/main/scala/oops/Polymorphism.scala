package oops
//====================method over loading============
//same class , same method, different parameters,,,,,,,,,,,Happens during compile time
class Polymorphism {

  def sum(a:Int, b:Int): Unit = {
    println(a+b)
  }

  def sum(a:Double, b:Int): Unit = {
    println(a+b)
  }

}

class child extends Polymorphism {
  override def sum(a:Int, b:Int): Unit = {
    println("Child class", a+b)
  }
}
object Test2 extends App {
  val c1= new Polymorphism()
  c1.sum(10,20)


//  val p1=new Polymorphism()
//  p1.sum(10,20)
//  p1.sum(10,20,30)
}




//same parameters, method selections during runtime, different class(Inheritance exists)/
//Method over riding


