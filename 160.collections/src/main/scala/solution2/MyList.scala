package solution2

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val digits = args.map(_.toInt).toList
  val reversedDigits = reverse(digits)
  println(reversedDigits.mkString(" "))

  private def reverse(in: List[Int]): List[Int] = {
    if(in.isEmpty) List()
    else reverse(in.tail) :+ in.head
  }
}
