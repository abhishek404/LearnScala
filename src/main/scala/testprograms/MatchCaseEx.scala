package testprograms

//https://dzone.com/articles/8-scala-pattern-matching-tricks


///Find the last element of a list.
//Example:
//scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8
class MatchCaseEx {

  def findLast[A](lst:List[A])= lst.last

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }

}

object MatchCaseEx {

  def main(args: Array[String]): Unit = {

    val oob = new MatchCaseEx()
    val element = oob.findLast(List(3,"4",5,6,7,"811"))
    print(element)

    val element1 = oob.lastRecursive(List(3,"4",5,6,7,"811"))
    print(element1)

  }
}
