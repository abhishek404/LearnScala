package next.step.in.scala

import java.util

object ScalaArray {

  def main(args: Array[String]): Unit = {
    val greetings = new Array[String](3)
    greetings(0) = "abhishek"
    greetings(1) = "ashima"
    greetings (2) = "ashi"

    print(greetings(1))

//  greetings = new Array[String](2) can not assign again to greetings due to val

    greetings(1)= "ashuma"
    print(greetings(1)) // can change the array value as they are mutable


  }
}
