package com.crz.scala

import scala.Array.concat

/**
  * 迭代器
  */
object Iterator {


  def main(args: Array[String]): Unit = {
    val it = List("c", "r", "z", "2")

    /**
      * 输出最大值
      */
    println(it.max);

    /**
      * 输出最小值
      */
    println(it.min);

    /**
      * 长度
      */
    println(it.length)


    val myList1 = List(1.9, 2.9, 3.4, 3.5);
    val myList2 = List(8.9, 7.9, 0.4, 1.5);

    val myList3 = List.concat(myList1, myList2)

    for (x <- myList3) {
      println(x)
    }

    /**
      * 类似Filter的功能
      */
    for (m <- 1 to 50; if m % 2 == 0; if m % 3 == 0) {
      println(m)
    }

  }
}
