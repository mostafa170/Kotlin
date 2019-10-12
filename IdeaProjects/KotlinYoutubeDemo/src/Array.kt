fun main(args:Array<String>){
    var arrayInt=Array<Int>(5){0}

    for (index in 0..4)
    {
        println("plz enter numbers")
        arrayInt[index]= readLine()!!.toInt()
    }
    for (item in arrayInt)
    {
        println(arrayInt[item])
    }
}