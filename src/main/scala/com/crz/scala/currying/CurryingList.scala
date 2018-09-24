package com.crz.scala.currying

object CurryingList {

  val list = List(1, 4, 6, 4, 1)

  def main(args: Array[String]) {
    //list./:是调用./方法，它是一个柯里化函数，其中(100)是第一个参数，
    // ({(sum,num)=>print(sum+"--"+num+" ");sum-num})是第二个参数。
    println(list./:(100)({
      (sum, num) =>
        print(sum + "--" + num + " "); //函数/:的第二个参数——匿名函数需要两个参数，
        // 匿名函数第一个参数为/:函数的第一个参数，匿名函数的返回值类型和/:函数的第一个参数类型一致
        sum + num //这里的匿名函数实际上是(sum,num)=>sum-num，就是传入两个参数sum和num，
      // 返回sum+num，返回值的类型显然和sum的类型一样。/:方法详见源码解读。
    })); //返回结果为100--1 101--4 105--6 111--4 115--1 116
  }

}
