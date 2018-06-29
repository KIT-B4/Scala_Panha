import java.io

object FlattenList
{
  def main(args: Array[String]): Unit = {
    var line = List("Lol","U flat","Lorem Ipsum")
    var page = List(line,112,113,114)
    var book = List(page,"X","Y","Z")
    var category = (book,"Scifi","Novel","Politics")
    var library = List(category,"A","B","C")

    var list = List(library)
    list: List[List[io.Serializable]];
    var flat = list.flatten
    print(flat)
  }
}
