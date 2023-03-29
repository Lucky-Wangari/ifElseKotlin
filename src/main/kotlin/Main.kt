fun main() {
    days("Monday")
    days("Friday")
    days("Tuesday")

    user(12)
    user(49)
    user(67)
    numbers()

/*var sequence = 1.. 50
 var a = 0
 var b = 1
 do{
     println("a")
     val sum = a + b
     a = b
     b = sum
 } while (a == sequence)*/

    ask()
   smile()
    find()
}

fun user(ages: Int){
   if (ages < 18){
       println("You are not old enough to vote")
} else if (ages in 18..65){
       println("You are eligible to vote")
}
    else{
        println("You are a senior citizen")
    }
}
//Write a program in Kotlin that prints the numbers from 1 to 10 using a for loop.
fun numbers(){
    var numb = 1..10
    for (x in numb){
        println(x)
    }

}
//Write a program in Kotlin that asks the user to enter a number and prints whether it is even or odd.
fun ask(){
    var old = 1..10
    for (x in old){
        if (x % 2 == 0){
            println("even")
        } else{
            println("odd")
        }
    }
}

//Write a program in Kotlin that uses a break statement to exit a loop when a certain condition is met.

fun find(){
    var check = 1..10
    for (x in check){
        if(x >= 10){
        break
        }
        println(x)
    }

    }
//named parameters
fun smile(){
    var pass = readLine()
    print("Enter password")
    if (pass == "password123"){
        println("Access granted")
    } else {
        println("Access denied")
    }
}
//If it is Monday, print "Monday blues". If it is Friday, print "TGIF!". For any other day, print "Just another day".
fun days(day: String){
    when{
        day == "Monday" -> println("Monday blues")
        day == "Friday" -> println("TGIF")
        else -> println("Just another day")
    }

}