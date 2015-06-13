package scalax

class CPerson(_firstName: String, _lastName: String, _age: Int)

case class CCPerson(firstname: String, lastname: String, age: Int)

object Person extends App {

  val cKid = new CPerson("John", "Smith", 9)
  val cAdult = new CPerson("Martin", "Smith", 47)
  val cAdult2 = new CPerson("Martin", "Smith", 47)

  println(cKid)
  println(cAdult)
  println(cAdult == cAdult2) // == checks for reference equality for ordinary classes

  val ccKid = CCPerson("John", "Smith", 9)
  val ccAdult = CCPerson("Martin", "Smith", 47)
  val ccAdult2 = CCPerson("Martin", "Smith", 47)

  println(ccKid)
  println(ccAdult)
  println(ccAdult == ccAdult2) // == checks for value equality for case classes

}
