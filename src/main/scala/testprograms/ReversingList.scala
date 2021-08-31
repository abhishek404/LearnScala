package testprograms

class ReversingList {

}

object ReversingList
{

  def main(args: Array[String]): Unit = {
    val lst:List[Integer] = List(1,2,4,5,7)

    val revereL = lst.foldLeft(List[Integer]()){(x,y)=>y::x}
    println(revereL)
  }

}