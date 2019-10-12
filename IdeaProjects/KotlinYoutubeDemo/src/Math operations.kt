fun main (args: Array<String>){
    println("math operation")
    println("plz enter your first num")
    var x1:Double=readLine()!!.toDouble()

    println("plz enter your second num")
    var x2:Double=readLine()!!.toDouble()
    var sum:Double=x1+x2

    println("sum = "+sum)

    println("plz enter your first num")
    var x:Double=readLine()!!.toDouble()

    println("plz enter your second num")
    var y:Double=readLine()!!.toDouble()
    var Subtract:Double=x-y

    println("Subtract = "+Subtract)

    println("plz enter your first num")
    var x3:Double=readLine()!!.toDouble()

    println("plz enter your second num")
    var y3:Double=readLine()!!.toDouble()
    var Multiply:Double=x3*y3

    println("Multiply = "+Multiply)

    println("plz enter your first num")
    var x4:Double=readLine()!!.toDouble()

    println("plz enter your second num")
    var y4:Double=readLine()!!.toDouble()

    var Dividing:Double=x4/y4
    if (0.equals(y4)) {
        println("error")
    }
    else{
        println("Dividing = "+Dividing)
    }
    var z:Double=2.0
    var z1:Double=3.0
    var z2:Double=4.0
    var z3:Double=4.0
    var op:Double=(z+(z1*z2))/z3

    println("operation = $op")


}