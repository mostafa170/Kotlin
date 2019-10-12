fun main(args:Array<String>){
    var name="mostafa kamel kamel"
    println(name)
    for (index in 0..name.length-1)
    {
        println("name[$index]"+name[index])
    }
    var x="welcome"
    var z=x+name
    println(z)
    println("title:"+ z.toLowerCase())
    println("title:"+ z.toUpperCase())
    println("title:"+ z.split(" "))
    println("title:"+ z.trim())
}