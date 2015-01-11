package solution

object HighLevelSyntax extends App {
  def buildString(one: String, two: String): String = {
    one + " " + two
  }

  val hello = "Hello"
  var world = "World!"

  if(args.length == 1) {
    world = args(0)
  }

  println(buildString(hello, world))
}
