package section4_kotlin_basics.`typealias`

typealias  AuthToken = String
fun main() {
    val user = User("Mahmoud","54564544s5623ead")
    Order(user.authToken)
}
data class User(val userName:String,val authToken: AuthToken)
data class Account(val authToken: AuthToken)
data class Order(val authToken: AuthToken)