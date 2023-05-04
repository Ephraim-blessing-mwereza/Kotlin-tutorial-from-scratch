package `4`.`0`.`Lists & Arrays`

fun main(){
    // you can mix aray with anumber
    val fruit = arrayOf("Apple","Orange","Mango","Grape",1,3,56,8, false, 3.09899)

    //array has an atrribute of printing taking mixed data types
    // in alist once created cannot be added or deleted

    // replacing index 2 of array with banana
    fruit[2] ="banana"
    println(fruit[2])
    println(fruit[5])
    println(fruit[9])

    // in array you cannot print all the elements inside the array
    println(fruit)

    // you can perform simailr function with strings and array diff is variable holds one character
    var str: String = "calss"
    println(str[2])

}