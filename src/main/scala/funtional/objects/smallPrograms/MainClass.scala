package funtional.objects.smallPrograms

import java.io.File

object MainClass {
  def main(args: Array[String]): Unit = {
    val r :Rational = new Rational(4,2)
    val r1 :Rational = new Rational(6)

    val r2= r.add(r1)
    print(r2)

  }


}
