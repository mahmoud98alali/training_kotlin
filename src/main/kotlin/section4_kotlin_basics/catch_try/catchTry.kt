package section4_kotlin_basics.catch_try

fun main() {

//    How to Use a Try Catch Statement in Kotlin

val obj = PersonInfo2("Mahmoud",15)

    try {
        showException(obj)
        println("done")
    } catch (e:Exception){
        when(e){
            is IndexOutOfBoundsException -> println("IndexOutOfBoundsException $e")
            is IllegalArgumentException -> println("IllegalArgumentException $e")
            else -> throw e
        }
//        println("Sorry we have Exception is $e")
    } finally {
        println("This is finally block")
    }
}

private fun showException(user : PersonInfo2){
    if (user.age < 18){
        throw IllegalArgumentException("\nHi ${user.name},Your age is ${user.age}?\nSorry your age is very small.")

    }

}

data class PersonInfo2(val name:String,val age:Int)