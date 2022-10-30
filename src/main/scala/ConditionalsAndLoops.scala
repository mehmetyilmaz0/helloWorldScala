/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object ConditionalsAndLoops {
  def main(args: Array[String]): Unit = {

    // if else
    val x = 30

    if (x == 10) println("Value of X is 10")
    else if (x == 20) println("Value of X is 20")
    else if (x == 30) println("Value of X is 30")
    else println("This is else statement")

    println("------------------------------------------------------------")
    // while
    var a = 10;
    while (a < 20) {
      println("while -> Value of a: " + a);
      a += 1;
    }

    println("------------------------------------------------------------")
    // for type 1
    a = 0;
    for (a <- 1 to 10) {
      println("for type 1 -> Value of a: " + a);
    }

    println("------------------------------------------------------------")
    // for type 2
    a = 0;
    for (a <- 1 until 10) {
      println("for type 2 -> Value of a: " + a);
    }

    println("------------------------------------------------------------")
    // for type 3
    a = 0;
    var b = 0;
    for (a <- 1 to 3; b <- 1 to 3) {
      println("for type 3 -> Value of a: " + a);
      println("for type 3 -> Value of b: " + b);
    }

    println("------------------------------------------------------------")
    // for ile collection olusturmak
    val tekNumaralar = for {i <- 1 to 30
                            if (i % 2) == 1
                            } yield i;
    tekNumaralar.foreach(println)

    println("------------------------------------------------------------")
    val meyveler = List("muz", "elma", "nar")
    meyveler.foreach(meyve => {
      println(meyve.toUpperCase());
    })

  }
}
