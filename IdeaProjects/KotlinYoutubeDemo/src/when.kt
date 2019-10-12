fun main(args : Array<String>){
    println("plz enter your number")
    var num:Double= readLine()!!.toDouble()

    when(num){
        1.0 -> {
            println("your number is 1")
        }
        2.0 ->{
            println("your number is 2")
        }
        3.0,4.0 ->{
            println("your number is 3 or 4")
        }
        in 10..30 ->{
            println("your number between is 10 ro 30")
        }
        !in 10..30 ->{
            println("your number between is not 10 ro 30")
        }
        else ->{
            println("error")
        }
    }
}