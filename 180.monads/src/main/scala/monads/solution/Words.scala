package monads.solution

import scala.io.Source

object Words extends App {
  val keywords = Source.fromURL(getClass.getResource("/keywords.txt")).getLines.toSet

  val words: List[String] = args.toList.flatMap { arg =>
    arg.split(" ").filter(word => word.length > 0)
  }

  val foundKeywords: List[String] = words.filter(word => keywords.contains(word.toLowerCase))
  println("All keywords: " + foundKeywords.mkString("[",",","]"))

  val upperCaseWords: List[String] = words.map(word => word.toUpperCase)
  println("All words in uppercase: " + upperCaseWords.mkString("[",",","]"))
}
