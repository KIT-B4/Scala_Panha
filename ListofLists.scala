object ListofLists{
  def main (args: Array[String]): Unit=
  {
    var list1 = List(1,2)
    var list2 = List(3,4)
    var list3 = List(list1,list2)

    println(list3)
  }
}
