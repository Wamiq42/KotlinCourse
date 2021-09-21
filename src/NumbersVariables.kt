fun main(arg: Array<String>)
{
    //Printing type of Variables
//    var a = 55
//    var b = 9999999999999
//    var c = "What up BOAH"
//    var d = 3.44
//    var pi = 3.1415926535
//
//    println(a :: class.java)
//    println(b :: class.java)
//    println(c :: class.java)
//    println(d :: class.java)
//    println(pi :: class.java)

    //Exercise
    /**
     * Ask the user to input a number and read it into a variable.
        Convert it to an integer.
        Multiply that value with a double variable that you created.
        What is the type of the new variable?
        Print it to the console.
     */

   // println("Enter a number")
   // var userNumero = readLine()?:""
   // var int = userNumero.toInt()
   // var dbnumber = int * 1.0
   // println(dbnumber)
   // println("The type of variable is ${dbnumber :: class.java}")

    //Practice Implicit and Explicit
//    var cats:Byte = 2
//    println(cats::class.java)
//    var dogs = 0.0F
//    println(dogs::class.java)
//    var bikes: Short = 2
//    println(bikes::class.java)
//    var bb = 8282828282828L
//    println(bb::class.java)
//    var cc:Double = 2.999999999999999
//    println(cc::class.java)
//
//    //Practice type Conversion
//    var longCats = cats.toLong()
//    println(longCats::class.java)
//    var doubledogs = dogs.toDouble()
//    println(doubledogs::class.java)

    //Exercise
    /**
    Ask the user for a number, and read the input.
        Convert that value to
            A byte
            A short
            An int
            A long
            A float
            A double
     */

//    println("Enter a number")
//    var enteredNumber = readLine()?:""
//    var intnumber:Int = enteredNumber.toInt()
//    var shortNumber:Short = enteredNumber.toShort()
//    var doubleNumber:Double = enteredNumber.toDouble()
//    var floatnumber = enteredNumber.toFloat()
//    var bytenumberr = enteredNumber.toByte()
//    var longnumber = enteredNumber.toLong()
//
//    println(intnumber::class.java)
//    println(longnumber::class.java)
//    println(shortNumber::class.java)
//    println(doubleNumber::class.java)
//    println(floatnumber::class.java)
//    println(bytenumberr::class.java)

    /**
     * You have the variable
                pi = 3.1413123
            What is the type?
            Convert it to a float. What is the value? Print it.
            Convert it to an int. What is the value? Print it.
            Convert it to a string. What is the value? Print it.

     */

//    var pi = 3.1413123
//    println("the type of pi is ${pi::class.java}")
//    var pifloat = pi.toFloat()
//    println("The value of piFloat is $pifloat")
//    println("the type of pi is ${pifloat::class.java}")
//    var piInt = pi.toInt()
//    println("The value of piInt is $piInt")
//    println("the type of piInt is ${piInt::class.java}")
//    var piString = pi.toString()
//    println("the value of piString is $piString")
//    println("the type of piString is ${piString::class.java}")

    /**
     * Ask the user to input a number of type double.
            Multiply it by pi
            Print the type of the resulting variable.
            Print the result
     */
    print("Enter a number with decimal point : ")
    var userdouble = readLine()?:""
    var userdouble2 = userdouble.toDouble()
    var pi = 3.14159
    var result = userdouble2 * pi
    println("The type of result is : ${result::class.java}")
    println("The result of entered number with pi is : $result")



}