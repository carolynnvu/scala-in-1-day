package com.gilt.pattern.matching.scala

sealed trait Item {
  def price: Int
}

case class Book(price: Int) extends Item

case class Clothes(price: Int) extends Item

case class Food(price: Int) extends Item

case class ShoppingCart(items: Set[Item]) {
  lazy val computeTax = {
    // books are 5%, clothes are 8%, food is 9% (see TaxVisitor.java)
    ???
  }
}

object ShoppingCart {
  def apply(items: Item*): ShoppingCart = new ShoppingCart(items.toSet)
}

object Example extends App {
  val cart = ShoppingCart(Book(10), Clothes(40), Food(12))
  println(s"tax = ${cart.computeTax}")
}
