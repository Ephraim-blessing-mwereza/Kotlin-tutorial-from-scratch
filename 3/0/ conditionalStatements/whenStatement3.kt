package `3`.`0`.` conditionalStatements`

// when length of level  = "hello" print out put
fun main(){
    var level = 8
    when (level){
        1 -> println("you are a beginner")
        in 2..4 -> println("you are not yet professional")
        6 -> println("you are a professional")


        // if length of level = hello.length
        "hello".length -> println("you are an expert")
        !in 2..4 -> println("you are not a professional")
    }
}