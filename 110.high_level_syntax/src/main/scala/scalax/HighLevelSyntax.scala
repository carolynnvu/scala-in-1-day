package scalax

object HighLevelSyntax extends App {
	def buildString(str1: String, str2: String): String = {
		str1 + " " + str2
	}

	var howdy = "Howdy"
	var name = "Woody"

  	println(buildString(howdy, name))
}

//App is a class that turns objects into executable programs.


