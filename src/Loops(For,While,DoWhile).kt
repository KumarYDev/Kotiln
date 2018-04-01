fun main(args:Array<String>){
//
    for(i in 0..10 )
        println(i )

//
    var i=1
    while(i <11){
        println(i)
        i++
    }

//
    var j=0
    do {
        println(j)
        j++
    }while (j==10)
//
    var str="hi print me"
    for (i in 0..str.length-1)
        println(str[i])

   exit@ for (i in 1..3)
        for(j in 1..3) {
            println("$i,$j")
        if(i==2&&j==1)
            break@exit
        }

}