fun main(args:Array<String>){
    var a=10
    var b=5

    var maxValue= if(a>b){
                    a
    println("a is greater")
         a               }
                else {
                         b
        println("a is greater")
        b
                    }

    println(maxValue)


//    When is replacment of switch

    val x=2
    when (x){
        0,1-> {
            println("x is 1")
        }
       in 2..5-> {
            println("x lies in 2,3 , 4, 5")
        }

        else -> {

            println("x is unknown")
        }
    }

//    same as if
    var str:String=    when (x){
        0,1-> {
            "x is 1"
        }
        in 2..5-> {
            "x lies in 2,3 , 4, 5"
        }

        else -> {

            "x is unknown"
        }
    }

}