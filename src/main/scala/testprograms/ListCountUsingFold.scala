package testprograms

object ListCountUsingFold {
  def main(args: Array[String]): Unit = {
    val lst:List[Integer] = List(1,2,4,5,7)

    val x = lst.foldLeft(0){(c,x) => println(c);c+1}
    println(x)
    val y = "ajsjsj"
    println(y.apply(4))
  }
}
