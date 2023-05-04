package `5`.`0`.` Loops`

fun main(){
    for (i in "Kotlin") {
        if (i == 'l') {
            break
        }
        print(i)
        println()
    }
    var  list  = listOf("mango", "grape","apple","orange")
    for (str in list){
        if(!str.contains('o')){
            continue
        }
        println(str)
    }
    // naming a loop
    loop1@ for (i in 1..10){
        loop2@ for (j in 1..10){
            if (i*j==50){
                break@loop1
            }
            println("$i * $j")
        }
    }
}
