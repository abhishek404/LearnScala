package testprograms
// get last nth element from list
object ListProgramFindElement {

  @scala.annotation.tailrec
  def getNthElementFromLast(elementno:Integer, x:List[Integer]):Integer=
    {
      val check = 0
      x match {
        case headElement :: restOfElement => if (check== elementno) headElement else getNthElementFromLast(elementno=elementno-1,restOfElement)
        case _ => 1
      }

    }

  def main(args: Array[String]): Unit = {
    val x:List[Integer] = List(1,2,3,4,5,6)
    val y = x.size
    val value= getNthElementFromLast(2,x)

    println(value)

    println(x.last)
    println(x.takeRight(2))


  }

}
