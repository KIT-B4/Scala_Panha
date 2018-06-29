object Factorial {
  def main(args: Array[String]): Unit = {
    var num = scala.io.StdIn.readInt();

    print(num + "! factorial is " +fac(num))
  }

  def fac(num: Int): Long = {
    if (num == 1) {
      return 1
    }
    else {
      return (num * fac(num - 1))
    }
  }
}