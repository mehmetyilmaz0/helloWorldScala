/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */
object Tuples {
  def main(args: Array[String]): Unit = {

    val tuple = (1, "Winnie", 95.6)
    println(tuple)
    println(tuple._2)
    printf("%s 'in not ortalamasi %.2f 'dir \n", tuple._2, tuple._3)

    val (id, name, not) = tuple;
    println("id : " + id + " name : " + name + " not : " + not)
  }
}
