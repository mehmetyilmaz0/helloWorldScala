/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */
object Lists {
  def main(args: Array[String]): Unit = {

    val list1 = List(5, 2, 3, 4, 1)
    println("list1 : " + list1)
    println("list1 in 2. elemani : " + list1(1))
    println("list1 in en buyuk elamani : " + list1.max + ", en kucuk elemani : " + list1.min)
    println("list1 in 2 den buyuk elemanlari : " + list1.filter(_>2))
    println("list1 toplami : " + list1.sum)
    println("list1 den 1 ve 4 haricindeki elemanlari : " + list1.slice(1, 4)) // 1 dahil 4 haric
    println("list1 ilk iki elemani sil : " + list1.drop(2))
    println("list1 en sagdaki 2 elemani sec : " + list1.takeRight(2))
    println("list1 i sirala : " + list1.sorted)
    println("list1 in her bir elemanini 2 ile carp : " + list1.map(x => x*2))

    val list2 = List(1, 3.3, "Winnie", true)
    println("list2 : " + list2.toString())
    // println("list2 toplami : " + list2.sum) // degiskenlerin hepsi Matchable olmadigi icin hata verir
    // println("list2 i sirala : " + list2.sorted) // degiskenlerin hepsi Matchable olmadigi icin hata verir

    val list1List2 = list1.zip(list2)
    println("list1 ve list2 yi tuples halinde birlestir : " + list1List2)
  }
}
