val users: List<User> = listOf(User("Marcos Placona", false),
    User("Arwa Hogan", active = false), User("Ellie Mack", false),
    User("Meredith Mccarthy", active = false))

//fun getActiveUsers() = users.filter { it.active }

/*fun getActiveUsers() = users.filter { it.active }
fun getInactiveUsers() = users.filter { !it.active }
fun getNamesStartingWithM() = users.filter { it.name.startsWith("M") }*/

val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7)
val evenNumbers = numbers.filter { it % 2 != 0 }
val notMultiplesOf3 = numbers.filterNot { number -> number % 3 == 0 }

fun main() {
    println(evenNumbers) // [2, 4, 6]
    println(notMultiplesOf3) // [1, 2, 4, 5, 7]
}