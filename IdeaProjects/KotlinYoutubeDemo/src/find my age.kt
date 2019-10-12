import java.util.*

fun main (args: Array<String>){
    println("plz enter your year of birth")
    var yearOfBirth:Int= readLine()!!.toInt()
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var processes:Int=year-yearOfBirth

    println("Age = $processes")

}