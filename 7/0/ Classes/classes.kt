package `7`.`0`.` Classes`

class Student(var name: String, var age: Int, var studentId: Long) {
    init {
        println("University students")
    }

    // any function inside a class is a method
    fun course(name: String, age: Int, studentId: Long){ // method
        println("Hi, my name is $name," +
                " I am $age years old and my ID is $studentId," +
                " I'm from computer engineering department")
    }
    fun faculty(){
        println("I'm an engineering student")
    }
}

class House(var height: Double, var color: String, var price: Double, var location: String = "Kiamunyi"){
    fun print(){
        println("house [height = $height, color = $color, " +
                "price = $price, location = $location]")
        // location is a default value that will be automatically added every print by this function
    }
}

fun main(){
    // objet
    var Student = Student("John Peter", 18, 239900)// object
    println(Student)
    Student.course("John Peter", 18, 239900)
    Student.faculty()

    //printing student is or ame etc
    println(Student.name)
    println(Student.age)
    println(Student.studentId)

    var house = House(height = 34.7, color = "blue", price = 690.43)
    // am not passing any location value because it is already passed in the class
    house.print()
    var greenHouse = House(height = 34.7, color = "green", price = 4590.43)
    greenHouse.print()

}