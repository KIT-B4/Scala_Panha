object PrintA{
  def main(args: Array[String]): Unit = {
    var name = List[String]("Alex", "Aloha", "Hola", "Bob")
    for(i <- 0 until name.length)
      {
        if(name(i).startsWith("A"))
          {
            println(name(i))
          }
      }
    name.foreach(c => (if(c.length()== 4) println("Yes") else println("No") ))
    name.foreach(c => (if(c.length()> 3) println("Yes") else println("No")))
    var a = name.filter(_.length>3)
    println(a)
  }
}