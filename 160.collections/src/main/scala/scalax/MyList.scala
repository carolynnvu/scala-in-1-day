package scalax

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val digits = args.map(_.toInt).toList
  val reversedDigits = reverse(digits)
  println(reversedDigits.mkString(" "))

  private def reverse(in: List[Int]): List[Int] = {
    in.reverse
  }
}
