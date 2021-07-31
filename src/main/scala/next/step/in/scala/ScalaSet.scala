package next.step.in.scala
import scala.collection.mutable
object ScalaSet {

  def main(args: Array[String]): Unit = {
    val mutablesSt = mutable.Set("abhishek",1,"stc")
    println(mutablesSt)

    mutablesSt +="ashu" // inside mutable set += is a defined method
    println(mutablesSt)


    var immutablesSt = Set("abhishek",1,"stc")
    println(immutablesSt)

    immutablesSt +="ashu" // for immutable set immutablesSt=immutablesSt+"ashu" , new set is assigned to immutablesSt
    println(immutablesSt)

  }
}
