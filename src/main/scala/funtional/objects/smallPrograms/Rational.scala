package funtional.objects.smallPrograms

class Rational(n:Int,d:Int) {
require(d!=0)
  val num:Int = n
  val den:Int = d

  override def toString=  s"$num/$den"

  def this(n:Int) = this(n,1)
  def add(that:Rational): Rational =
    {new Rational(n*that.den+that.num*d,d*that.den)}

}
