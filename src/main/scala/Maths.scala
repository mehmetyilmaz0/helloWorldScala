import scala.math._
/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object Maths {
  def main(args: Array[String]): Unit = {

    // standart matematiksel islemler haricindekiler :
    println("-8 in mutlak degeri -> " + abs(-8))
    println("8 in karekoku -> " + sqrt(8))
    println("2 nin 8 inci kuvveti -> " + pow(2,8))
    println("e sayisinin fonksiyonu -> " + exp(1))
    println("2 yi bucuga gore yuvarla (asagi) -> " + round(2.49))
    println("2 yi bucuga gore yuvarla (yukari)-> " + round(2.59))
    println("2 yi tam sayiya gore asagi yuvarla -> " + floor(2.59))
    println("2 yi tam sayiya gore yukari yuvarla -> " + ceil(2.59))
    println("e tabaninda log(2) -> " + log(2))
    println("10 tabaninda log10(100) -> " + log10(100))
    println("2 ile 5 den hangisi daha kucuk -> " + min(2, 5))
    println("2 ile 5 den hangisi daha buyuk -> " + max(2, 5))
  }
}
