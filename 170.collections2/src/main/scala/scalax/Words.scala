package scalax

object Words extends App {
   val keywords = Set("scala", "rocks")

   var words = List.empty[String]
   for (arg <- args) {
     // ???
   }

  if (false /* ??? */) {
    println("No words!")
  } else {
    val first: String = ???
    println("First word is " + first)
    val remainder: List[String] = ???
    println("Remaining words are " + remainder.mkString(","))
  }

   if (false /* ??? */) {
     println("Words contain keywords")
   } else {
     println("No keywords found")
   }

  if (!words.isEmpty) {
    if (false /* ??? */) {
      println("Words contain only keywords")
    } else {
      println("Non-keywords found")
    }
  }

  val firstKeyword: Option[String] = ???
  val firstNonKeyword: Option[String] = ???
  println("First keyword " + firstKeyword.getOrElse("not found"))
  println("First non-keyword is " + firstNonKeyword.getOrElse("not found"))
 }
