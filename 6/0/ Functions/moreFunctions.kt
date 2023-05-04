package `6`.`0`.` Functions`

 fun descending (list: List<Int>): ArrayList<Int>{
     val result = arrayListOf<Int>()
     for(i in 0 until list.size-1){ // main, 10 -2
         result.add(list.get(list.size - 1 - i))
     }
     return result
 }

fun descending2 (list: List<Int>): ArrayList<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size-1 downTo 0){
        result.add(list.get(i))
    }
    return result
}

fun main(){
    val num = listOf(1,2,3,4,5,6,7,8,9,10)
    println(num)
    println(descending(num))
    println(descending2(num))
}