fun main(args:Array<String>){
    println("plz enter frist number")
    var z:Double= readLine()!!.toDouble()

    println("plz enter frist number")
    var x:Double= readLine()!!.toDouble()
    var y= sum(z,x)
    println("Sum = $y")

    showname("Kamel")

}
fun sum(double1: Double,double2: Double): Double {
    var x=double1+double2
    return x
}
fun showname(name: String){
    println("Name is $name")
}