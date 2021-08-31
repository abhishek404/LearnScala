package testprograms

object EliminateConsecutiveElements {

  def main(args: Array[String]): Unit = {
    val lst:List[Integer] = List(1,1,1,2,3,4,1,1)

    val newLst = lst.foldLeft(List[Integer]()){(x,y) => if (!x.isEmpty && x.last == y) x else x:+y }

    println(newLst)

    val l=lst.dropWhile(_==1)
    print(l)
  }
}
