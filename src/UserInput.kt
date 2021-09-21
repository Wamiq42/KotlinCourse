import kotlin.math.absoluteValue
import kotlin.math.sign
import kotlin.random.Random

fun main(arg: Array<String>)
{
    //practice
    println("Enter your Name")
    val fullName = readLine()
    println("Good Morning Mr. $fullName")
/**
    println()

    println("Enter a number Mr $fullName")
    val enteredNumero = readLine()?:""
    println("Five times of the entered number is : 5 * $enteredNumero = ${enteredNumero.toInt() * 5 }")
*/
    println("Enter a number")
    val fromNumero = readLine()?:""
    println("Enter another number")
    val toNumero = readLine()?:""
    println("The Generated Random Number is ${Random.nextInt(fromNumero.toInt(),toNumero.toInt())}")

    println()

    //Exercise
    println("Mr. $fullName Enter your birth year")
    val birthyear = readLine()?:""
    val age = 2021 - birthyear.toInt()
    println("Mr $fullName You are $age or ${age.dec()} years old")

}

