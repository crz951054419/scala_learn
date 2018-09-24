package com.crz.scala.currying

/**
  * 柯里化
  * 参数分离
  *   1.类似于门面?
  */
object Currying {

  def mulitply(x: Int)(y: Int) = x * y

  def mulitply2 = mulitply(3) _;

  def main(args: Array[String]) {
    println(mulitply(4)(2))
    println(mulitply2(4))

  }
}
