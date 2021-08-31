package testprograms

class palindromeList {

}

object palindromeList
{
  def reverse(lst:List[Int])= lst==lst.reverse

  def main(args: Array[String]): Unit = {
    val x = List(3,2,1,2,3)

    val size = x.size-1
    println(size)
    var bool = true
    for (i <- 0 until x.size/2 )
    {
      if (x(i)!=x(size-i))
        {
          println("not a Palindrome")
          bool = false
        }
    }

    if (bool) println("its palindrome")

    // 2nd way
    val boolCheck = reverse(lst = x)
    println(boolCheck)

  }

}