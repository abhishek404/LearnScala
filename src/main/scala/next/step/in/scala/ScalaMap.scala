package next.step.in.scala
import scala.collection.mutable
object ScalaMap {


  def main(args: Array[String]): Unit = {

    val mutablemp = mutable.Map[Int,String]()

    mutablemp+=(1->"abhi")
    mutablemp+=(2->"abhie")
    mutablemp+=(3->"abhih")
    mutablemp+=(4->"abhis") // += is a method of mutable map and set ie why we can use it as it looks like reassignment

    println(s"mutablemp :- $mutablemp")


    var immutableMp = Map[Int,String]()

    immutableMp+=(1->"abhi")
    immutableMp+=(2->"abhie")
    immutableMp+=(3->"abhih")
    immutableMp+=(4->"abhis")

    println(s"immutableMp :- $immutableMp")

//    Accesing elemetn

  }
}
