import javax.lang.model.element.Name


fun variable(){
    // VariableType Data(variable)Name:DataType = DataValue
    val MyName:String = "Vaibhav Anil Vyavahare"
    //-> Vaibhav Anil Vyavahare

    // Here we are storing some value in val variable type
    // there are 2 variable types
    // 1] val   2]var
    // to reassign value to a old variable we can add this data to var variable Type.
    var time = "12 PM"
    println(time)
    //-> 12 PM
    time= "1 PM"
    println(time)
    // -> 1 PM (so we are able to assign new value to variable beacuse of *var*)
}

fun datatypes(){
    // datatypes used to define type,Nature Of Value entered in variable
    // 1) Int 2)String 3)Boolean 4)Float 5) Double ect...

    // we also can create new data type as we want what like this we created datatype named as *Student*
    val student1=Student("Vaibhav" , 18)
    student1.Stdetails()
    //-> WE CREATED NEW TYPE OF DATA NAMED AS STUDENT THEN WE WRITE SPECIFICATION OF THAT DATA TYPE (class)
    //->AFTER WE CREATE VARIABLE STUDENT1 AND ADD STUDENT DETAILS IN IT
    //->AND THEN WE CALL memeber fun of that class for studen1 variable

}
class Student(var Name:String , var RollNo:Int){
    fun Stdetails(){
        println("My Name is $Name and My Roll No is $RollNo")

    }

}
