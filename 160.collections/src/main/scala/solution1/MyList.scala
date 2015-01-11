package solution1

import scala.collection.mutable

object MyList extends App {
  assert(args.size >= 1, "Usage: MyList 1 2 3 ...")

  val digits = new mutable.ListBuffer[Int]()
  for(i <- 0 until args.size) {
    digits += args(i).toInt
  }

  val reversedDigits = mutable.ListBuffer[Int]()
  reverse(digits, reversedDigits)
  for(i <- 0 until reversedDigits.size) {
    print(reversedDigits(i) + " ")
  }
  println()

  private def reverse(in: mutable.ListBuffer[Int], out: mutable.ListBuffer[Int]): Unit = {
    for(i <- 0 until in.size) {
      in(i) +=: out
    }
  }
}
