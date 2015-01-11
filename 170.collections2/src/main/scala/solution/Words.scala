package solution

object Words extends App {
  val keywords = Set("scala", "rocks")

  var words = List.empty[String]
  for (arg <- args) {
    val parts = arg.split(" ")
    for (part <- parts) {
      if (part.length() > 0) {
        words = words :+ part
      }
    }
  }

  if (words.isEmpty) {
    println("No words!")
  } else {
    val first: String = words.head
    println("First word is " + first)
    val remainder: List[String] = words.tail
    println("Remaining words are " + remainder.mkString(","))
  }

  if (words.exists(word => keywords.contains(word.toLowerCase))) {
    println("Words contain keywords")
  } else {
    println("No keywords found")
  }

  if (!words.isEmpty) {
    if (words.forall(word => keywords.contains(word.toLowerCase))) {
      println("Words contain only keywords")
    } else {
      println("Non-keywords found")
    }
  }

  val firstKeyword = words.find(word => keywords.contains(word.toLowerCase))
  val firstNonKeyword = words.find(word => !keywords.contains(word.toLowerCase))
  println("First keyword " + firstKeyword.getOrElse("not found"))
  println("First non-keyword is " + firstNonKeyword.getOrElse("not found"))
}
