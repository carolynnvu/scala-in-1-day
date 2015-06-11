package scalax

import scala.collection.mutable.ListBuffer

object Make extends Enumeration {
  type Make = Value
  val BMW, Ford, Porsche, Toyota = Value 
}

import Make._

object Garage {
  //ListBuffer is a buffer internally backed by a linked list
  val vehicles = new ListBuffer[Vehicle]()

  //ListBuffer inherits .synchronized from AnyRef class (a.k.a. root of all -reference- types)
  //The method synchronizes any object that extends AnyRef
  def addVehicle(vehicle: Vehicle) { 
    vehicles.synchronized {
      vehicles += vehicle
    }
  }

  def getVehicles: List[Vehicle] = {
    vehicles.synchronized {
      vehicles.toList
    }
  }
}

//In Scala, the compiler automatically creates the corresponding class fields from the parameters 
class Vehicle(val make: Make, val wheelCount: Int)

class Truck(make: Make) extends Vehicle(make, 18)

class Car(make: Make) extends Vehicle(make, 4)

//"interface"
trait Convertible {
  def openTop: Unit
  def closeTop: Unit
}

class SportsCar(make: Make) extends Car(make) with Convertible {
  private var topOpen = false

  override def openTop: Unit = {
    if(topOpen) {
      println("Top is open")
    } else {
      println("Opening top")
      topOpen = true
    }
  }

  override def closeTop: Unit = {
    if(topOpen) {
      println("Closing top")
      topOpen = false
    } else {
      println("Top is closed")
    }
  }
}

object SportsCar {
  def apply(makeStr: String): SportsCar = {
    val make = Make.withName(makeStr)
    new SportsCar(make) //Scala convention to not use 'return'
  }
}

object ClassesTraitsObjects extends App {
 Garage.addVehicle(new SportsCar(Porsche))
 Garage.addVehicle(SportsCar("BMW"))
 Garage.addVehicle(new Truck(Ford))
 Garage.addVehicle(new Truck(Toyota))

 Garage.getVehicles.foreach { v =>
   println("This vehicle is a " + v.make + " and has " + v.wheelCount + " wheels")
   v match {
     case c: Convertible => {
       println("Oooh, this vehicle is a convertible. Let's play with the top!")
       c.openTop
       c.openTop
       c.closeTop
       c.closeTop
     }
     case _ => println("Not a convertible")
   }
 }
}
