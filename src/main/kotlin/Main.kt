fun main() {
    var number = 0

    print("Please enter a number between 1 and 10 inclusive: ")
    number = readLine()!!.toInt()

    when(number){
        1 -> println("Eins")
        2 -> println("Zwei")
        3 -> println("Drei")
        4 -> println("Vier")
        5 -> println("Funf")
        6 -> println("Sechs")
        7 -> println("Sieben")
        8 -> println("Acht")
        9 -> println("Neun")
        10 -> println("Zehn")
        !in 1..10 -> println("You did not enter a number between 1 and 10 inclusive, fool")
    }
}