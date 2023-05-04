package `4`.`0`.`Lists & Arrays`

fun main(){
    // combines all the attributes of arrays and attributes of list
    val fruits = arrayListOf("Apple","Orange","Mango","Grape",1,3,56,8, false, 3.09899,"d")
    //replacing element at index 2 with value 5
    fruits[2] = 5
    println(fruits[10])
    println(fruits)

    var sub = fruits.subList(1,4)
    /* wht this does is
    1- 4 = 3, 1, 2
    element at index 3 will be printed because its the result
    element at index 4 was not printed because its the last number there

     */
    println(sub)

    // trial 2
    var subs = fruits.subList(1,3)
    /* what this does is
    1- 3 = 2, 1
    element at index 2 will  be printed because its the result
    element at index 3 was not printed because its the last number there

     */
    println(subs)

    // trial 3
    var subLists = fruits.subList(1,8)
    /* what this does is
    1- 8 = 7, 1
    element at index 7 will  be printed because its the result
    elements at indices 2,3,4,5,6 will also be printed to the two
    element at index 8 was not printed because its the last number there

     */
    println(subLists)
}