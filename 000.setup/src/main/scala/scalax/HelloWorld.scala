package scalax

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!")
  }
}

//Scala doesn't have static methods; instead it has singletons (here, HelloWorld)
//Method with Unit return type is like a Java method with a void return. 
//Variable type declaration occurs on the right and is optional in most cases because of type inference.
