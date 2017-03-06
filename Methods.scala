object Methods{
  def main(args: Array[String]): Unit = {
     printNumber; // calling print number
     println(`is This Even`(10));
     println(add(3,5));
     println(addition(2,5));
  }

  def add(x : Int, y : Int ) : Int = {
     return x + y;
  }

  def addition(x : Int, y : Int) = x + y;

  def printNumber = println("printing numbers"); // defining printnumber method. Unit comes under AnyVal.
  // () represents a unit. def test{} means it returns Unit.

  def `is This Even`(x :Int) = if(x % 2 == 0) true else false; 
  // Methods can have spaces and other valid identifiers, If it is surrounded by backticks.
}
