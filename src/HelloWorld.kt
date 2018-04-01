import com.Practice.Person

/*
*
*
*
*
**/
fun main(args: Array<String>){

    var myString="ahelloo"
    println(myString)

    var number:String
    number="this is working"
    println(number)

    val fixed:Int
    fixed=406
//    fixed=10
    display(fixed)
    var displayInClass=DisplayInClass()
    displayInClass.display(number)

//
    displayInClass.number="Hello"
    println("this is tesing"+displayInClass.number)
    println("this is tesing \n${displayInClass.number}\n$number")
//
    var person= Person("this is package")
//    person.number=
    person.display()
}

fun display(name: Int){
    println(name)
}

class DisplayInClass{
    var number:String=""
    fun display(name:String) {
        print(name)
    }
}