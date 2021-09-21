fun main(arg: Array<String>)
{
    //exercise 1
    val catName = "My cat's name is \"Ding Dong\""
    println(catName)
    var slashes = "Two types of slashes \\ and /"
    println(slashes)
    var link = "https://www.google.com"
    println(link)

    println()

    //exercise 2
    var bunny = "(\\ (\\ \n(-.-)\no_(\")(\")"
    println(bunny)

    //adding an extra line between exercise
    println()

    var bunnyHead = "(\\ (\\"
    var bunnyBody = "(-.-)"
    var bunnyFeet = "o_(\")(\")"
    println(bunnyHead)
    println(bunnyBody)
    println(bunnyFeet)

    println()

    // exercise 3
    println(catName+"\nthe length of \"catName\" variable is ${catName.length}")
    var myPC= "My PC won't start"
    println(myPC.substring(3,5))
    var apples=3
    var oranges=4
    println("the total number of fruits = ${apples+oranges}")

    println()

    //exercise 4
    /** A client has purchased a number of products that have a certain price
     * Print out the total amount that client needs to pay
     *           client = "Mary"
                 products = 3
                 price = 30

     */
    val client = "mary"
    val products = 3
    val price = 30

    println("Mary needs to pay total amount of  ${price*products}")
}