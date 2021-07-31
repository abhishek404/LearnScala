package funtion.and.closures

object FuntionLiterals {

  def main(args: Array[String]): Unit = {
//A function literal is compiled into a class that when instantiated at runtime
//is a function value.[2] Thus the distinction between function literals and
//values is that function literals exist in the source code, whereas function
//values exist as objects at runtime. The distinction is much like that between
//classes (source code) and objects (runtime).

    val a = (a:Int) => a + 15 // this is called function literals

    println(a(2)) // this is the way of calling literal

    // using underscore to represent the variable if it comes only once in the literal

    val b = (_:Int) + 15

    val listScala = List(5,6,7,8)

    val litFun = (_:Int) > 7

    val c = listScala.filter(litFun)

    println(c)

    val ax = 1 to 100
    println(ax)
//    """Partial applied Function
//      A partially applied function is an expression in which you don't supply all
//      of the arguments needed by the function. Instead, you supply some, or none,
//      of the needed arguments.
//
//      """
    val partialFunc= sum _
    println(s"partial function --> $partialFunc")

    val getsum = partialFunc(2,3,4)
    println(s"sum --> $getsum")


  }

  def sum(a:Int,b:Int,c:Int):Int=
    {
      a+b+c
    }

  def makeIncreaser(more: Int) = (x: Int) => x + more
}
