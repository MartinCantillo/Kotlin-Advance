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
    // mutable list (only read)

    val nameList= mutableListOf<String>()
    // val nameList: MutableList<String> = mutableListOf()
    nameList.add("Martin")
    nameList.add("Camilo")
   // nameList.remove("Martin")
    nameList.forEach { i -> println(i) }

    //Read only list (I can not add, update , delete)

    val readList= listOf<String>("Juan","Martin Jose","Martin")
    readList.forEach { i -> println(i) }
    println("----")
    println(readList.count())
  //  readList.forEach{i->println(i.length)}
    println("Martin" in readList) //if "Martin" is in the list , it throws true
}