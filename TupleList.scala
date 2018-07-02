object TupleList
{
  def main(args: Array[String]){
    var x = ("Hello", 5, 10.3f, "Hey")
    var z = ("A")
    var y = x +: z
    var sum:Float = 0
    x.productIterator.foreach(
    {
      case i : Int => sum += i
      case f : Float => sum += f
      case _ : String=>
    }
    )
    println(sum)
    println(y)
    println(x)

  }
}
