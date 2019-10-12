fun main(args:Array<String>){
    var count=0
    var count1=0
    for (count  in 0..10){
        if (count==5){
            break
        }
        println(count)
    }
    println("------------------------")
    for (count  in 0..10){
        if (count==5){
            continue
        }
        println(count)
    }
    println("------------------------")
   loop@ for (count  in 0..10){
        for (count1 in 0..3){
            println(count)
            if (count==3){
                break@loop
            }
        }
    }
}