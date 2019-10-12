fun main(args:Array<String>){
    var map=HashMap<Int, String>()
    //      key  string
    map.put(1,"mostafa")
    map.put(2,"kamel")
    map.put(3,"kamel")
    map.put(4,"abd ELaal")
    //updata
    map.put(3,"ssss")
    for (index in map.keys){
        println(map[index])
    }
}