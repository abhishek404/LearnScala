package testprograms
//https://blog.knoldus.com/scala-map-vs-flatmap/
class FlattenList {

}

object FlattenList
{

  def flatening(eleList:List[Any]):List[Int]=
    {
      eleList.flatMap {
        case x:List[_] => flatening(x)
        case y:Int => List[Int](y)
      }
    }

  def main(args: Array[String]): Unit = {
    val lst = List(List(1, 1), 2, List(3, List(5, 8)))

//    when using flatmap need to convert every element as part of Traversable means
//    some sub type of collection so we can apply flat on

    val flatList = flatening(lst)
    println(flatList)


  }
}