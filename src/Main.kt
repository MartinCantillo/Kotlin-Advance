fun main() {
    println("Hello World!")
//val , i can not change the reference (Int to Double)
    val num :Int=10
    println(num);

var array = arrayOf<Int>(1,2,3,4,5
    )
//    for (item in array) {
//        println(item)
//    }
    print("Second printing")
    println()
    array.forEach { i: Int -> println(i) }

    //Lists
    //non mutable list (only read)

    val nameList= mutableListOf<String>()
    nameList.add("Martin")
    nameList.add("Camilo")
    nameList.forEach { i -> println(i) }


}