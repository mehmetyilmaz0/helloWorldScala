import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello Scala World");

    Logger.getLogger("org").setLevel(Level.ERROR);

    val spark = SparkSession.builder()
      .master("local")
      .appName("vector_distance")
      .getOrCreate();

    val rdd = spark.sparkContext.parallelize(Seq(1, 2, 3, 4));
    println(rdd.first());
  }
}
