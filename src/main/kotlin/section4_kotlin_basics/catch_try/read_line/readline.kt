fun main() {
//    println("Enter your Name and Age:")
//    val name = readlnOrNull()
//    val age = readlnOrNull()!!.toInt()
//    println("Your name is $name")

    println("Enter your Name:")
    val name = readLine()!!.toString()
    val value = name.split(' ')
    val firstChar = value[0].substring(0,1)
    val lastChar = value[1].substring(0,1)
    println("$firstChar $lastChar")
}