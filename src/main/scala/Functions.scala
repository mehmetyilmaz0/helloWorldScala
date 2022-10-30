/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object Functions {
  def main(args: Array[String]): Unit = {

    def topla(sayi1: Int, sayi2: Int): Int = {
      sayi1 + sayi2;
    }
    println(" 2 + 5 = " + topla(2, 5))
    println("------------------------------------------------------------")

    def sayilariTopla(args: Int*): Int = {
      var toplam = 0
      for(i <- args) {
        toplam += i
      }
      toplam
    }
    println("1,2,3,4,5,6 sayilarin toplami : " + sayilariTopla(1,2,3,4,5,6))
    println("------------------------------------------------------------")


    val sayiTopla = (sayi1: Int, sayi2: Int) => sayi1 + sayi2;
    println("sayiTopla ile 2 + 5 = " + sayiTopla(2, 5))
    println("------------------------------------------------------------")


    def toplamVeCarpim (sayi1: Int, sayi2: Int): (Double, Double) = {
      var toplam: Double = 0
      var carpim: Double = 0

      toplam = sayi1 + sayi2
      carpim = sayi1 * sayi2

      (toplam, carpim)
    }

    println("toplamVeCarpim 2 ve 5 = " + toplamVeCarpim(2, 5))
    println("------------------------------------------------------------")
  }
}
