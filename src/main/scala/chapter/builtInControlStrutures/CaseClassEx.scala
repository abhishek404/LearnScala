package chapter.builtInControlStrutures

object CaseClassEx {
  def main(args: Array[String]): Unit = {
    val a = "abc"
    val b = "def"
    val c = "abcd"

    matchTry(a)
    matchTry(b)
    matchTry(c)
  }

  def matchTry(x:String): Unit =
  {
    x match {
      case "abc" => println("correct")
      case "def" => println("incorrect")
      case _ => println("default")
    }
  }
}
