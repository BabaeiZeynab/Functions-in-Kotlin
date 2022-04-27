import java.util.Scanner


/*
 get list of students's score from 10 student whose score and print scores  greater than 18
 */

fun studentScore() {
    var scanner = Scanner(System.`in`)
    var numberOfSudent = 1
    var scores = arrayListOf<Int>()

    do {
        var score = 0
        print("Enter student $numberOfSudent scores: ")

        score = scanner.nextInt()
        if (score in 18..20) {
            scores.add(score)
        }

        numberOfSudent++
    } while (numberOfSudent <= 5)

    scores.forEach {

        println("score is greater than 18: $it ")


    }


}


// How to return two values from function

fun sumNumbers():Pair<Int , Int> {
    val scanner = Scanner(System.`in`)

    print("Enter num1: ")
    var num1 = scanner.nextInt()
    print("Enter Num2:  ")
    var num2 = scanner.nextInt()
    var sum = num1+num2
    println("Sum is $sum")
    return Pair (num1 , num2)


}


fun getThreeNumbers() {
    var scanner = Scanner(System.`in`)
    var numbersList = arrayListOf<Int>()

    var count = 1;
   println("Enter 3 Numbers")
    while (count <= 3) {
        print("Enter Number $count: ")
        var number = scanner.nextInt()
        numbersList.add(number)
        count++
    }

    var largest : Int= 0
    for(i in numbersList){
        if(i > largest){
            largest = i
        }
    }
    println("latgest number is $largest")


}

fun main(args: Array<String>) {
    // How to get three Numbers and extract the largest one
    getThreeNumbers()


    studentScore()
   var (number1, number2) = sumNumbers()
    print("number1 is  $number1 and number2 is $number2")


}



