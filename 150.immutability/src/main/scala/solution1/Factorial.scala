package solution1

object Factorial extends App {
  assert(args.size == 1, "Usage: Factorial <n>")
  val n = args(0).toInt
  assert(n >= 0, "<n> needs to be >= 0")

  println(fac(n))

  private def fac(n: Int): Int = {
    var f = 1
    for(i <- 1 to n) {
      f = f * i
    }
    f
  }
}
