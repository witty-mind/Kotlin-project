fun main() {
    // println("Hello world")

    /*val additionResult = addTwoNumbers(100, 40)
    println(additionResult);

    getLargestNumberFromGivenNumbers(100, 24, 18)*/


    /* printMessage("Hello")                                               // 5
     printMessageWithPrefix("Hello", "Log")                              // 6
     printMessageWithPrefix("Hello")                                     // 7
     printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
     println(sum(1, 2))*/

    //printMessageOnDemand("There is no internet connection. Please try again later.", "Signals")

    //foo(baz = 1)

    /*fooBar(1) { println("hello") }     // Uses the default value baz = 1
    fooBar(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
    fooBar { println("hello") }        // Uses both default values bar = 0 and baz = 1*/

   // defaultValueParameters("dev_ritz", getDashValue = "Test", isStatus = true);

    val getData = accumulate(100)
    print(getData)


}


fun double(x: Int): Int = x * 2

fun addTwoNumbers(numberOne: Int, numberTwo: Int): Int {
    return numberOne + numberTwo;
}

/**
 * Getting the Largest number among the given numbers
 */
fun getLargestNumberFromGivenNumbers(numberOne: Int, numberTwo: Int, numberThree: Int): Int {
    val resultNumber: Int = numberOne;
    if (numberTwo > numberOne && numberTwo > numberThree) {
        println("The Largest number is $numberTwo")
    } else if (numberThree > numberOne && numberThree > numberTwo) {
        println("The Largest number is $numberThree")
    } else {
        println("The Largest number is $numberOne")
    }
    return resultNumber;
}

//A simple function that takes a parameter of type String and returns Unit (i.e., no return value).
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

//A function that takes a second optional parameter with default value Info. The return type is omitted, meaning that it's actually Unit
fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

//A function that returns an integer.
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

// A single-expression function that returns an integer (inferred).
fun multiply(x: Int, y: Int) = x * y

fun printMessageOnDemand(messageText: String, titleText: String = "No Internet") {
    print("The Message To Be displayed is \n \n $titleText \n \n $messageText")
}

fun foo(bar: Int = 0, baz: Int) {
    println(bar)
    println(baz)
}

fun fooBar(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
    println(bar)
    println(baz)
}

fun defaultValueParameters(getVerifiedUerName: String, getDashValue: String, isStatus: Boolean) {
    var testValue: Int = 0
    fun addThisNumbers(){
        val getDetailsDataOf: Int = 1000
        testValue = 10 + 30 + getDetailsDataOf
    }
    println(getVerifiedUerName)
    println(getDashValue)
    println(testValue)
}

fun accumulate(number: Int): Int {
    var givenNumber = number
    fun add() {
        givenNumber++
    }
    for (i in 1..10) {
        add()
    }
    return givenNumber
}