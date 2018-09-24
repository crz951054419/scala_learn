package com.crz.scala

object Def {

  def add(a: Int, b: Int) = a + b

  def add2 = add(_: Int, 3)

  def main(args: Array[String]) {
    println(add2(5))
    println(fact(5))
  }

  /**
    * 递归
    *
    * @param num
    * @return
    */
  def fact(num: Int): Int = {
    if (num == 0 || num == 1)
      return 1
    else
      return fact(num - 1) * num
  }

}
