object ArrayArray {
  def main(args: Array[String]): Unit = {
    var temp = 0
    print("Enter array size: ")
    var n = scala.io.StdIn.readInt()
    var arr = new Array[Int](n)
    var sum = 0
    print("Enter the elements: ")
    for (i <- 0 until n) {
      arr(i) = scala.io.StdIn.readInt()
      sum += arr(i)
    }
    temp = arr(0)
    for (i <- 0 until n) {
      if(temp < arr(i))
        {
          temp = arr(i)
        }
    }
    print("Sum of array: " + sum)
    print("\nMax_Num(Logic): "+temp)
    print("\nMax_Num(Built-In function): " + arr.max)
    print("\nEnter array size for second array: ")
    var m = scala.io.StdIn.readInt()
    var arr1 = new Array[Int](m)
    print("Enter the elements for Array 2: ")
    for (i <- 0 until m) {
      arr1(i) = scala.io.StdIn.readInt()
    }
    var arrCon = new Array[Int](n+m)
    arrCon = arr ++ arr1
    print("The concatenated Array: \n")
   arrCon.foreach(x=>{print("["+x+"], ")})
  }
}

