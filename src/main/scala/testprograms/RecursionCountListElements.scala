package testprograms

object RecursionCountListElements {

  @scala.annotation.tailrec
  def countElements(result:Integer, lst:List[Integer]):Integer=
  {

    lst match {
      case head::rest => countElements(result+1,rest)
      case Nil => result
    }
  }

  def main(args: Array[String]): Unit = {
    val lst:List[Integer] = List(1,2,4,5,7)

    val noOfElements = countElements(0,lst)

    println(noOfElements)
  }

}
