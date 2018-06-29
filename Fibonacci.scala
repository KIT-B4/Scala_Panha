object Fibonacci{
  def main(args: Array[String]): Unit = {
      print("The Fibonacci series.\n Enter a number: ")
      var a = scala.io.StdIn.readInt()
    print("The fibonacci series: "+fibo(a))
  }
  def fibo(a:Int): Unit ={
    var i:Int = 0
    var j:Int = 1
    var str:String = null
    var sum:Int = 0
    while(i > 2)
      {
        sum = i+j
        i=j
        j =j+1
        str = str + sum
      }
  }
}