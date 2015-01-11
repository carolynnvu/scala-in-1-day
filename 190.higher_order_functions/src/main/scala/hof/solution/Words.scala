package hof.solution

object Words extends App {
  val words = args.toList.flatMap { arg =>
    arg.split(" ").filter(word => word.length > 0)
  }

  val wordsByFirstLetter: Map[Char, List[String]] = words.groupBy(_.head.toLower)
  println("Words by first letter: " + wordsByFirstLetter)

  val (even, odd): (List[String], List[String]) = words.partition(_.length % 2 == 0)
  println("Words with even length: " + even)
  println("Words with odd length: " + odd)

  val wordHistogram: Map[String, Int] = words.foldLeft(Map.empty[String, Int]) { (m, w) =>
    val key = w.toLowerCase
    m.get(key).map { count =>
      m + (key -> (count + 1))
    }.getOrElse {
      m + (key -> 1)
    }
  }
  println("Word frequencies: " + wordHistogram)
}
