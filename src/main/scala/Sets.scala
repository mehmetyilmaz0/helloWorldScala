/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */
object Sets {
  def main(args: Array[String]): Unit = {
    // Set içindeki her bir eleman tekildir. birden fazla ayni eleman varsa teke dusurur
    // Immutable ve muteable Set var.

    /** Immutable Set */
    val emptySet = Set()
    println("emtySet : " + emptySet)

    val tekrarlayanSet = Set("winnie", "piglet", "winnie", "piglet", "tiger")
    println("tekrarlayanSet : " + tekrarlayanSet)

    val karisikSet = Set("winnie", 12, true, 4.5, "winnie")
    println("karisikSet : " + karisikSet)


    // Setlerde indeks yoktur ve sırasızdır
    // Diğer collectionlarda elemana erişim için kullanılan myCollection(index) calismaz
    // Setlerde elemana erişim için değil elemanın varlığının kontrolü için çalışır.
    println("karisikSet icerisinde winnie var mi? : " + karisikSet("winnie"))
    println("karisikSet icerisinde tiger var mi? : " + karisikSet("tiger"))

    /** Mutable Set */
    val degistirilebilirSet = scala.collection.mutable.Set(1, 2, 3, 4)
    degistirilebilirSet += 5
    println("degistirilebilirSet e 5 elemani eklendi. yeni degistirilebilirSet: " + degistirilebilirSet)
    degistirilebilirSet.add(11)
    println("degistirilebilirSet e 11 elemani da eklendi. yeni degistirilebilirSet: " + degistirilebilirSet)

    val list = List(1,2,3,4,4)
    println("list is list : " + list)
    val listToSet = list.toSet
    println("listToSet is set : " + listToSet)

    val tekrarlayanSet2 = Set("tom", "jerry", "winnie", "mehmet", "tiger")
    println("tekrarlayanSet ile tekrarlayanSet2 'in kesisen elemanlari : " + tekrarlayanSet.intersect(tekrarlayanSet2))
    // println("tekrarlayanSet ile karisikSet 'in kesisen elemanlari : " + tekrarlayanSet.intersect(karisikSet)) // hata verir cunku tekrarlayanSettum elemanlarinin tipleri ile karisikSet in elemanlarinin tipleri ayni degil
    println("tekrarlayanSet in tekrarlayanSet2 'den farkli elemanlari : " + tekrarlayanSet.diff(tekrarlayanSet2))
    println("tekrarlayanSet2 in tekrarlayanSet1 'den farkli elemanlari : " + tekrarlayanSet2.diff(tekrarlayanSet))
    println("tekrarlayanSet ile tekrarlayanSet2 'in birlesimi : " + tekrarlayanSet.union(tekrarlayanSet2))
  }
}
