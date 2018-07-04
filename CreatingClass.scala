class CreatingClass(var id:Int , var name:String) {
  override
  def toString: String = {
    id + " : " + name
  }
}
object Student {
  def main(args: Array[String]): Unit = {

    var s1 = new CreatingClass(123, "Lmao")
    println(s1.toString())
  }
}



