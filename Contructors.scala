 object Constructors{
  def main(args : Array[String]) = {
  val user = new User("user 1", "user@gmail.com"); // calling the primary constructor
  println(user.name);

  val user2 = new User("user 2");

  println(user2.name + ",  " + user2.email);

  }
 }

 class User(val name : String, val email : String){
    // creating the secondary constructor with only name.
    def this(name : String) = { this(name, "defautl_email@mail.com")}
 }
