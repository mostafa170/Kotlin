
fun main(args:Array<String>){
    var numstring:String="3432"
    var numint:Int=numstring.toInt()
    println(numint)
    println("/////////////")

    var numstring1:String="34.32"
    var numint1:Double=numstring1.toDouble()
    println(numint1)
    println("/////////////")

    var numstring2:Double=34.32
    var numint2:Int=numstring2.toInt()
    println(numint2)
    println("/////////////")

    var numstring3:Int=3432
    var numint3:String=numstring3.toString()
    println(numint3)
}