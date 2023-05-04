package `3`.`0`.` conditionalStatements`
// when statement
fun main(){
    var level = 156
    var result = when(level) {
        5 -> "You are experienced"
        3 -> "You are still good at the job"
        1 -> "you are a beginner"
        else -> "confirm your level"
    }
    println(result)
}