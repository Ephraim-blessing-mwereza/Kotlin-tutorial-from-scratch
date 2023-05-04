package `10`.`0`.` Encapsulation`

/*
these are the getter and setter methods in java
encapsulation is the process of accessing private and public properties in kotlin
 */
class Workers {
    private var name: String = " "
    private var age: Int = 0
    private var idNumber: Long =0

    public fun getName():String{
        return this.name
    }
    public fun setName(name: String){
        this.name = name
    }
    public fun getAge():Int{
        return this.age
    }
    public fun setAge(age: Int){
        this.age = age
    }
    public fun getIdNumber():Long{
        return this.idNumber
    }
    public fun setIdNumber(idNumber: Long){
        this.idNumber=idNumber
    }
}

// optional method for encapsulation
class Animal{
    var age: Int = 0
        // field gives a way of returning actual value
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
            else{
                println("Please check entry or the age, you entered")
            }
        }
}


fun main(){

    var animal = Animal()
    animal.age = 4
    println(animal.age)

    println("I'm in")
    var w = Workers()
    w.setName("sam")
    w.setAge(23)
    w.setIdNumber(39505137)
    println("Hi!, My name is ${w.getName()}"
    +" am of ${w.getAge()} years"
    +" this is my Id number: ${w.getIdNumber()}")
}