package solution3

import scala.annotation.tailrec

object Factorial extends App {
  assert(args.size == 1, "Usage: Factorial <n>")
  val n = args(0).toInt
  assert(n >= 0, "<n> needs to be >= 0")

  println(fac(n))

  private def fac(n: Int): Int = {
    @tailrec
    def fac(n: Int, acc: Int): Int = {
      if(n == 0) acc
      else fac(n - 1, acc * n)
    }
    fac(n, 1)
  }
}
