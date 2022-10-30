/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 30.10.2022 
 * */
import breeze.stats._ // istatiksel islemler
import org.apache.spark.ml.linalg._ // machine learning lineer cebir library
object Vector {
  def main(args: Array[String]): Unit = {

    /** create zero vector */
    val zeroVector = Vectors.dense(Array(0.0, 0.0, 0.0, 0.0, 0.0))
    val zeroVector2 = Vectors.zeros(5)

    println("zeroVector : " + zeroVector) // spark-shell çıktısı : zeroVector: org.apache.spark.ml.linalg.Vector = [0.0,0.0,0.0,0.0,0.0]
    println("zeroVector 0.index : " + zeroVector(0)) // spark-shell çıktısı : res0: Double = 0.0
    println("zeroVector'ü dense vector e donustur  : " + zeroVector.toDense) // spark-shell çıktısı : res1: org.apache.spark.ml.linalg.DenseVector = [0.0,0.0,0.0,0.0,0.0]


    val yasVector = Vectors.dense(Array(25.0, 43.0, 12.0, 21.0, 10.0)).toDense
    val yasVector2 = Vectors.dense(37.0, 27.0, 55.0, 71.0, 11.0).toDense
    println("yasVector ortalamasi : " + mean(yasVector.toArray))
    println("yasVector varyansi : " + variance(yasVector.toArray))
    println("yasVector standart sapmasi : " + stddev(yasVector.toArray))
    println("iki vektor arasindaki mesafe : " + Vectors.sqdist(yasVector, yasVector2))


    def kovaryansHesapla (x: DenseVector, y: DenseVector): Double = {
      var kovaryans = 0.0
      val xMean = mean(x.toArray)
      val yMean = mean(y.toArray)
      var total = 0.0
      val n = x.size

      for (i <- 0 until n) {
        total += (x(i) - xMean) * (y(i) - yMean)
      }

      kovaryans = total / (n - 1)
      kovaryans
    }

    def korelasyonHesapla (x: DenseVector, y: DenseVector): Double = {
      var korelasyon = 0.0
      val kovaryans = kovaryansHesapla(x, y)
      val xStd = stddev(x.toArray)
      val yStd = stddev(y.toArray)

      korelasyon = kovaryans / (xStd * yStd)
      korelasyon
    }

    println("korelasyonHesapla(yasVector, yasVector2) : " + korelasyonHesapla(yasVector, yasVector2))
  }
}
