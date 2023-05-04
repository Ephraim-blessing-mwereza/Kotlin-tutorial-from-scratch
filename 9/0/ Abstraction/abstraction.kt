package `9`.`0`.` Abstraction`

open class Person (open var name: String, open var age: Int){
    /* in abstract class  we cannot instantiate
    any object apart from the child class
    a function with no body cannot be abstract
    major difference between abstract and open keyword
     */
        init{
            println("creating a new object")
        }
    open fun speak(){
        println("Hi, there I hope you are fine")
    }
    fun greet(name: String){
        println("Hi, good friends, my name is $name")
    }
    fun getYearOfBirth() = 2022 - age
}
class Student(override var name: String, override var age: Int, var studentId: Long): Person(name, age){
      // any function inside a class is a method
    fun faculty(){
        println("Iam a science student")
    }
    override fun speak(){
        println("Hi there, I am a student")
    }
}

class Employee(override var name: String, override var age: Int, var staffId: Long): Person(name, age){
    // any function inside a class is a method
    fun level(){
        println("Iam a level 12 staff")
    }
    fun paid(){
        println("Payment received")
    }
    override fun speak(){
        println("Hi there, I am a staff")
    }
}
fun main(){
    var student = Student("John Tom", 18,56123)
    student.speak()
    println(student.getYearOfBirth())

    var employee = Employee("Patrick Kate", 34,34566)
    employee.greet("Patrick Kate")
    println(employee.getYearOfBirth())
    employee.paid()
    employee.speak()

    var person = Person("Jane Petre", 35)
    person.speak()
}
