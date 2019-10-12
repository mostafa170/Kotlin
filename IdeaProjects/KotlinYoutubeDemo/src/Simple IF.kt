fun main(args:Array<String>){
    println("Enter grade")
    var grade:Double= readLine()!!.toDouble()

    if (grade<65&&grade>=50)
    {
        println("your grade is Acceptable")
    }
    else if (grade<75&&grade>=65)
    {
        println("your grade is Good")
    }
    else if (grade<85&&grade>=75)
    {
        println("your grade is Very Good")
    }
    else if (grade>=85&&grade<=100)
    {
        println("your grade is Excellence")
    }
    else if (grade<50&&grade>=0)
    {
        println("your grade is fail")
    }
    else
    {
        println("error in enter your number")
    }
}