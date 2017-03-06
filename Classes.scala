import scala.beans.BeanProperty
object Classes{
def main(args : Array[String]){
  println("Classes");
  val simple:Simple = new Simple();
  println(simple);
  val user = new User("vishnu","vishnu@gmail.com");
  // no need to define the getter, since the properties are val( final ), getters will be
  // available automatically.
  // if we use var instead of val, setters will also be availble but that 
  // is being considered as a bad practice. Scala prefers immutability.
  println(user.name);

 val empl = new Employee(10, "Sam");
 println(empl.getEmpId);

}
}

class Simple();

class User(val name : String, val email : String);

// Adding scala.beans.@BeanProperty annotation to provide getters since the prperties are val.
class Employee(@BeanProperty val empId : Int, @BeanProperty val empName : String);
