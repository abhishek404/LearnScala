import java.io.File

object TestNewClass extends App {

//  print("abhishek")
//val a =103
//  print(a.abs)
  val files = new File(".").listFiles()

  def getlines(filedata: File)=
  {
    scala.io.Source.fromFile(filedata).getLines().toArray
  }

  for (file <- files
    if file.getName.contains("gradlew");
    lines <- getlines(file)
    if lines.length>100
  )print(lines)

//  def newthing= for (file <-files if file.getName.contains("g") ) yield{ file} //producing a new collection
//
//  for (file <- newthing)
//    println(file)
}
