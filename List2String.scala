object List2String
{
  def main(args: Array[String]): Unit = {
    var list1 = List(1,2)
    var list2 = List(3,4)
    var list3 = List.concat(list1,list2)
    var list1str = list1.mkString

    //Convert string to list
    print(list1str+" \n")
    //Print all except last
    print(list3.init)
    }
}
