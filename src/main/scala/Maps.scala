/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */
object Maps {
  def main(args: Array[String]): Unit = {

    val ulkeBaskent1 = Map("Japonya" -> "Tokyo", "Turkiye" -> "Ankara", "Hindistan" -> "Delhi")
    println("ulkeBaskent1: " + ulkeBaskent1)

    val ulkeBaskent2 = Map(("Japonya", "Tokyo"), ("Turkiye", "Ankara"), ("Hindistan", "Delhi"))
    println("ulkeBaskent2: " + ulkeBaskent2)

    val key = "Japonya"
    if (ulkeBaskent1.contains(key))
      println("Japonya'nın baskenti : " + ulkeBaskent1.get(key));

    val ulkeBaskent3 = collection.mutable.Map("Japonya" -> "Tokyo", "Turkiye" -> "Ankara", "Hindistan" -> "Delhi")
    ulkeBaskent3("Almanya") = "Berlin"
    ulkeBaskent3 += ("Ispanya" -> "Madrid")
    ulkeBaskent3 += (("Fransa" , "Paris"))
    println("ulkeBaskent3: " + ulkeBaskent3)
  }
}
