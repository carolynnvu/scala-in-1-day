package scalax

import scala.language.implicitConversions

case class MyVector(v: Vector[Char])

object HelloWorld extends App {
  assert(args.size == 1, "Usage: HelloWorld <text>")

  val text = args(0)
  println("Hello " + text)
  println("Hello " + text.map(_.toUpper))

  val vector = text.to[Vector]
  println("Hello " + vector)
  println("Hello " + vector.map(_.toUpper))

  val myVector = MyVector(text.to[Vector])
  println("Hello " + myVector)
  println("Hello " + myVector.map(_.toUpper))
}
