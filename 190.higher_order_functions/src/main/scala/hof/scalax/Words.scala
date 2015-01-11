package hof.scalax

object Words extends App {
  val words = args.toList.flatMap { arg =>
    arg.split(" ").filter(word => word.length > 0)
  }

  val wordsByFirstLetter: Map[Char, List[String]] = ???
  println("Words by first letter: " + wordsByFirstLetter)

  val even, odd: (List[String], List[String]) = ???
  println("Words with even length: " + even)
  println("Words with odd length: " + odd)

  val wordHistogram: Map[String, Int] = words.foldLeft(???) {
    ???
  }
  println("Word frequencies: " + wordHistogram)
}
