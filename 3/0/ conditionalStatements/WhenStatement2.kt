package `3`.`0`.` conditionalStatements`

// when statement
fun main(){
    var level = 134567
 when(level) {
     1 -> println("you are a beginner")
     in 2..4 -> println("you are not yet a professional")
     5 -> println("you are a professional")
     else -> println("confirm your level")
    }
}