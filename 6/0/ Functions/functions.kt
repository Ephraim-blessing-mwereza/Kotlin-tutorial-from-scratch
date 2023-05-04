package `6`.`0`.` Functions`

import java.util.Date

// function takes no parameter no return
fun greet(){
    println("good day class")
}

// function takes 2 parameters and returns an integer
fun max(a:Int, b:Int):Int{
    if (a>=b){
        return a
    }
    else{
        return b
    }
}
//take no parameter and return date
fun getCurrentDate():Date{
    return Date()
}

/*
take a parameter with no return type
print a string with no space
 */
fun withSpace(text:String){
    for(char in text){
        println(char+"")
    }
    // println()
}

// printing the output but horizontally
fun withSpace2(text:String){
    for(char in text){
        print(char+"  ")
    }
}
fun main(){
    greet()
    println(max(23,56))
    println(getCurrentDate())
    println(withSpace("life is good"))
    println(withSpace2("life is good "))

}