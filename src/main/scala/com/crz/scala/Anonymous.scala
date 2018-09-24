package com.crz.scala

object Anonymous {

  val t = () => 132;

  def main(args: Array[String]): Unit = {
    println(t())
  }
}
