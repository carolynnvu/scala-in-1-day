package scalax

object Factorial extends App {
  assert(args.size == 1, "Usage: Factorial <n>")
  val n = args(0).toInt
  assert(n >= 0, "<n> needs to be >= 0")

  println(fac(n))

  private def fac(n: Int): Int = {
    0
  }
}
