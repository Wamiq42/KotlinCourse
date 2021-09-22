fun main(arg: Array<String>)
{
    //arthematic operators
    print("Enter a number (no decimal Point): ")
    var a = readLine()?:""

    print("Enter a second number (no decimal Point): ")
    var b = readLine()?:""

    var result = a.toInt() + b.toInt()
    println("The addition of the entered numbers = $result")

    result = a.toInt() - b.toInt()
    println("The subraction of the entered numbers = $result")

    result = a.toInt() * b.toInt()
    println("The multiplication of the entered numbers = $result")

    result = a.toInt() / b.toInt()
    println("The Division of the entered numbers = $result")

    result = a.toInt() % b.toInt()
    println("The Remainder of the entered numbers = $result")

    var ain:Int = a.toInt()
    ain++

    println("The increment of a is $ain")

    //result type
    var c:Short = a.toShort()
    var d:Long = b.toLong()

    var result2 = c - d

    println("The data type of result2 is ${result2::class.java}")

    //Augmented Assignment Operator
    var pc = 10
    pc += 1
    println(pc)
    pc -= 2
    println(pc)
    pc *= 5
    println(pc)
    pc /= 2
    println(pc)
    pc %= 5
    println(pc)

    /**
     * We have two variables.
            var a = 76.254
            var b = 3.867
         Calculate and print out
            Addition
            Subtraction
            Multiplication
            Division
            Remainder

     */







}
