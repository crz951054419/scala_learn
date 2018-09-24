package com.crz.scala

/**
  * match
  */
object Switch {


  def _match(i: Int) = {
    i match {
      case 1 => println(i);
      case 2 => println(i);
      case _ => println("default");

    }

    i
  }

  def main(args: Array[String]): Unit = {
    _match(1);
  }
}
