package `4`.`0`.`Lists & Arrays`

fun main(){
    var maleNames = arrayListOf("Peter","Josh","Franklin",
        "Daniel","Mark","Victor","Vincent")
    var femaleName = arrayListOf("Sandra","Victoria","Sarah",
        "Grace","Kate","Josephine")
    println(maleNames)
    println(femaleName)
    // adding these two list together
    var combine = maleNames + femaleName
    println(combine)
    //printing the array list from an index
    println(maleNames[0])
    //printing the size of the elements in array
    println(maleNames.size)
    // checking if the list in the array is empty
    var check: Boolean = maleNames.isEmpty()
    println(check)
    // adding elements in the array list while specifying position
    femaleName.add(1,"Daniela")
    println(femaleName)
    // checking if array contains a particular value/element, the output is a boolean value
    println(maleNames.contains("Josh"))
    // remove element from the list, checking if the value was removed or not with boolean values
    var rem: Boolean = maleNames.remove("Josh")
    println(rem)
    //printing male names after the removal
    println(maleNames)
}