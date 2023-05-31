package section4_kotlin_basics
import kotlin.Exception

// package dataTypes
// package conditions

fun main() {
    // println("Hllo Word!")
    // var a:Int  = 1
    // var b:Int  = 2
    // val a1:Byte =8
//     val str:String= """
//         Hi Mahmoud!
//         How are you?
//         Do you speak english?
//     """.trimIndent()


//     println(str)



//     println("======================================")
//     val str2:String= """
//     Hi Mahmoud!
//     How are you?
//     Do you speak english?
// """.replaceIndent("- ")


// println(str2)



// println("======================================")
// val str3:String= """
// >> Hi Mahmoud!
// >> How are you?
// >> Do you speak english?
// """.trimMargin(">> ")


// println(str3)


// println("======================================")

// var isBlank:Boolean = true

// println(isBlank)
// println(isBlank.not())

// isBlank = "mahmoud".isBlank();

// println(isBlank);

// println("======================================")

// // PostFix a++  a--
// // PreFix ++d   --a
// var a = 6
// var b = 0

// println("a value is $a")
// println("a value is $b")

// // PostFix
// b=a++

// println("With PostFix")
// println("a value is $a")
// println("a value is $b")

// // PreFix
// b=++a

// println("With PreFix")
// println("a value is $a")
// println("a value is $b")





// var name1 = "Mahmoud"
// var name2 = "Ahmad"
// println(name1.equals(name2))


// var obj1 = Person(name = "Ahmad")
// var obj2 = Person(name = "Ahmad")
    // the result is false becouse obj1
// println(obj1.equals(obj2))


// val user = User("q","Ahmad")

// // when(user.firstName){
// //     "Mohamed" -> println("This is Mohamed")
// //     "Ahmad" -> println("This is Ahmad")
// //     else -> println("This is not Found")

// // }

// when {
// user.firstName == "Mohamed" && user.lasrName == "Ahmad" -> { println("This is Mohamed Ahmad")}
// else  ->  println("This is not Mohamed Ahmad")


// }


// val accountType  = AccountType.BRONZE

// val msg = when(accountType){
// AccountType.BRONZE -> {"BROZE Member Access Allowed"}
// AccountType.SILVER -> {"SILVER Member Access Allowed"}
// AccountType.GOLD -> {"GOLD Member Access Allowed"}
// AccountType.PLATINUM -> {"PLATINUM Member Access Allowed"}

// }


// val values = listOf(1,2,3,4,5,6,7)

// for(i in values){

//     println(i)
// }

// val values2 = listOf("Dart","Kotlin","Java")


// for(lang in values2){

//     println(lang)
// }


// for(i in 0 until 5){
//     println(i)
// }


// for(i in 0 until 5 step 2){
//     println(i)
// }


// for(i in 50 downTo 0){
//     println(i)
// }
///////////////**********
// var start = "*"
//
// for(i in 0 until 5){
//     println(start)
//     start += "*"
// }

//    var firstOne = "*"
//
//    println(firstOne )
//    println(firstOne +firstOne)
//    println(firstOne +firstOne)
//    println(firstOne +firstOne)
//    println(firstOne +firstOne)
//    println(firstOne +firstOne)
//    println(firstOne +firstOne)
//    val count = 5
//
//    for(i in count downTo 1 ){
//
//        for (j in 1..i){
//            print("^")
//        }
//        println()
//    }

//
//        val count = 4
//        var number = 1
//
//    for(i in 1..count ){
//
//        for (j in 1..i){
//            print("$number ")
//            number+=1
//        }
//        println()
//    }


//***************************************************
//  39,40 How to Cast in Kotlin - Kotlin Type Casting With as
//    val obj1:Any = getStuff("1")
//    val obj2:Any = getStuff("2")
//    val obj3:Any = getStuff("3")
//    val obj4:Any = getStuff("4")
//    val test1:Int = obj1 as Int
//    val test2:String = obj2 as String
//    val test3:Boolean = obj3 as Boolean
//    val test4:Boolean = obj4 as Boolean
//    val test5 = obj4 as? Int
//    println("Value == 1 -> $test1\n" +
//            "Value == 2 -> $test2\n" +
//            "Value == 3 -> $test3\n" +
//            "Value == 4 -> $test4\n" +
//            "Value == 4 with Safe Casting with 'as?' -> $test5\n"
//    )

//***************************************************

    //Play
    //41. How to Throw an Exception in Kotlin

    val obj = PersonInfo("Ahmad", 11)
    if (obj.age < 18){
//        throw ExceptionInInitializerError("The user is very less")
        throw InvalidException(obj.age,"The user is very small")
    }


//***************************************************



}
//***************************************************

//Play
//41. How to Throw an Exception in Kotlin

class  InvalidException(val age: Int,val message2:String):Exception("The age: $age, $message2")

data class PersonInfo(val name: String, val age:Int)




//***************************************************


//***************************************************
// How to Cast in Kotlin - Kotlin Type Casting With as
//fun getStuff(value:String):Any{
//    return when(value){
//        "1" -> 99
//        "2" -> "Ahmad"
//        "3" -> true
//        else -> false
//    }
//}

//***************************************************


// class Person(var name:String)

// class User (var firstName:String,var lasrName:String){}


// enum class AccountType {
// BRONZE,
// SILVER,
// GOLD,
// PLATINUM
// }