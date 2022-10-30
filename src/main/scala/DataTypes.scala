/**
 * @project helloWorldScala
 * @author mehmet.yilmaz on 29.10.2022 
 * */
object DataTypes {
  def main(args: Array[String]): Unit = {

    val myByte: Byte = 127
    println("myByte : " + myByte)

    val myBool: Boolean = false
    println("myBool : " + myBool)

    val myChar: Char = 'w'
    println("myChar : " + myChar)

    val myShort: Short = 32767
    println("myShort : " + myShort)

    val myInt: Int = 32767345
    println("myInt : " + myInt)

    val myLong: Long = 32734995
    println("myLong : " + myLong)

    val myFloat: Float = 327.33
    println("myFloat : " + myFloat)

    val myBigInt: BigInt = 32762334
    println("myBigInt : " + myBigInt)

    val myBigDecimal: BigDecimal = 32767323423445.234243324
    println("myBigDecimal : " + myBigDecimal)

    // tur donusumleri
    val doubleMax: Double = Double.MaxValue
    println("doubleMax : " + doubleMax + " -> doubleMax.intValue " + doubleMax.intValue()) // deger kaybi oluyor. cunku int < double
    
    val intMax: Int = Int.MaxValue
    println("intMax : " + intMax + " -> intMax.doubleValue " + intMax.doubleValue()) // deger kaybi olmaz. cunku int < double



  }
}
