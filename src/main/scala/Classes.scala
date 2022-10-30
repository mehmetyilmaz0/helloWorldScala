/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */

object Classes {
  def main(args: Array[String]): Unit = {

    // nesnelerin sablonunu, davranislarini tanimliyoruz.
    val ogrenci = new Ogrenci("winnie", "the pooh");
    ogrenci.adiSoyadiVeNotu(95)


    /** case class */
    case class Point (x: Int, y: Int)
    val point1 = Point(1,2)
    val point2 = Point(2,3)
    if (point1 == point2) println("Ayni") else println("Farkli")

    case class Ogrenci2(name: String, surname: String, notu: Int)
    val ogrenci2 = new Ogrenci2("winnie", "the pooh", 95)
    val ogrenci3 = new Ogrenci2("tiger", "aslan", 10)
    println("ogrenci2 adi : " + ogrenci2.name + " ogrenci2 soyadi : " + ogrenci2.surname + " ogrenci2 notu : " + ogrenci2.notu)
    println("ogrenci3 adi : " + ogrenci3.name + " ogrenci3 soyadi : " + ogrenci3.surname + " ogrenci3 notu : " + ogrenci3.notu)


    case class VarsayilanDegerliClass (name: String = "isim yok", surname: String = "isim yok", notu: Int = 0)
    val ogrenci4 = new VarsayilanDegerliClass();
    println("ogrenci4 adi : " + ogrenci4.name + " ogrenci4 soyadi : " + ogrenci4.surname + " ogrenci4 notu : " + ogrenci4.notu)
    val ogrenci5 = new VarsayilanDegerliClass("tom", "kedi", 30);
    println("ogrenci5 adi : " + ogrenci5.name + " ogrenci5 soyadi : " + ogrenci5.surname + " ogrenci5 notu : " + ogrenci5.notu)
  }
}
