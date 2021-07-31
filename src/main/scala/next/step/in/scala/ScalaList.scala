package next.step.in.scala

import java.util

object ScalaList {

  def main(args: Array[String]): Unit = {
    val la = new util.ArrayList[Int](2)
    la.add(2)
    val la1 = new util.ArrayList[Int](2)
    val la2= la1.add(4)

    la.addAll(la1)
    println(la) // this example shows that Java arrays are mutable

    val scalaList = List(1,2,3)
    val scalaList2 = List(4,5,6)
    val scalaList3 = scalaList:::scalaList2
    println(s"Unchanged list:- $scalaList2") // this example shows that Scala lists are immutable

    val scalaList4 = scalaList3.filter(x => x>4)

    println(s"filter list :- $scalaList4")

  }

}
