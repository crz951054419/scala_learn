package com.crz.scala

/**
  * 复合函数
  */
object Group {


  //定义一个函数f=(x+y)*z
  def f(x: Int, y: Int, z: Int): Int = {
    //针对需求，要定义个两个数相乘的函数g=a*b，相当于复合函数。
    def g(a: Int, b: Int): Int = {
      a * b
    }

    g((x + y), z)
  }

  def main(args: Array[String]) {
    println(f(2, 3, 5))
  }
}
