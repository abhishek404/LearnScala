package funtion.and.closures

object RepeatedParameter {


  def main(args: Array[String]): Unit = {

    print(sumAll(4,5,6,7,89))

  }

  def sumAll(x:Int,y:Int*): Int =
  {
      var sum = 0
    y.foreach(sum += _)

    return 0
  }
}
