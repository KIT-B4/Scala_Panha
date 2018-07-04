object AliceBob
{
  def main(args: Array[String]): Unit = {
    var a = Array(5,6,20,35)
    var b = Array(10,6,15,44)
    var r = 0

    for(i<-0 until a.length) {
      if (a(i) > b(i)) {
        r += 1
        print(r+" ")

      }
      else if (a(i) < b(i)) {
        r += 1
        print(r+ " ")
      }
      r = 0
    }
  }
}
