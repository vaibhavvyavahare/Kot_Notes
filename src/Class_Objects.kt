// OOP = Object Oriented Programing
// 1) Classes & Objects
// class ClassName(Primary Constructor)
// {
//      {Secondary Constructors}
//      fun member function name(){
//      }
//      etc...
// }
class Car(val Model:String , val CarNo:Int){
    fun cardetails() {
        println("This is $Model Model Car And Its Regestration No Is $CarNo")
    }
}
// secendory constructors

class Juice
{
    constructor(Fruit:String )
    {
println("This jucic is made up of $Fruit")
    }
    constructor(AMT:Int){
println("and this is tottal $AMT of liter")
    }
}



class Subject(val subname:String , val Marks:Int){
    fun sub(){
        println("This is $subname and this subject is for $Marks Marks")
    }
}

// data classes predefine member funs = .toString , .equal or == , .copy
/* que 1
Define a data class Employee with two properties: one for a name,
and another for a salary. Make sure that the property for salary is mutable,
otherwise you won’t
 get a salary boost at the end of the year!
 The main function demonstrates how you can use this data class
 */
data class Employee(var name:String , var salary:Int){
    fun vav(){}
}
fun main(){
    val	emp	=	Employee("Mary",	20)
    println(emp)
    emp.salary	+=	10
    println(emp)
}