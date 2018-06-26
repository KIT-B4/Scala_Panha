object FunWithFunction
{
  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    var n = scala.io.StdIn.readInt();
    Guess(n)
    print("Enter another number to add: ")
    var m = scala.io.StdIn.readInt()
    print("Square of 1st number"+n+"="+Square(n)+"\n")
    print("Sum of Square"+n+" + "+m+"="+SumOfSquare(n,m)+"\n")
  }
  //make square
  def Square (n: Int): Integer = {return n*n};
  //get some of square taking 2 parameter
  def SumOfSquare(n:Int, m:Int ): Long = {var sum = Square(n) + Square(m); return sum}
  //taking a guess and check whether they are closing to the actual answer
  def Guess(n:Int): Unit =
  {
    print("Enter a number to guess the above Square: ")
    var x = scala.io.StdIn.readInt();
    while(x != Square(n)-1 && x != Square(n)+1 && x != Square(n))
      {
          print("not Correct\n")
          print( Square(n) - x+"\n")
          x = scala.io.StdIn.readInt()
      }
    print("correct\n")
      }
  }

