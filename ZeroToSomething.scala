object ZeroToSomething {
  def main(args: Array[String]): Unit = {
    var n = scala.io.StdIn.readInt();

    for (i<-0 to n)
      {
        if (i % 4!=0 || (i ==0))
          {
            print(i+"\n")
          }
      }
  }
}
