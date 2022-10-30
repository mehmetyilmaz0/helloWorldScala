/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object PrintFormating {
  def main(args: Array[String]): Unit = {

    val isim = "Winnie"
    val yas = 32
    val boy = 1.29

    println(s"Benim ismim ${isim}")
    println(f"Benim ismim ${isim} ve boyum da ${boy}%.3f")
    println(f"Ben 5 yil sonra ${yas + 5} yasinda olacagim")
  }

}
