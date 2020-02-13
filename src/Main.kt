import kotlin.system.exitProcess

fun main() {
    var input: Int
    do {
        println("======================")
        println("------ Game Suit -----")
        println("======================")
        println("Pilihan :")
        println("1. Player VS Player")
        println("2. Player VS Computer")
        println("3. Exit")
        print("Masukan pilihan : ")
        input = readLine()!!.toInt()
        val suit = Suit()
        when (input) {
            1 -> suit.getPlayer()
            2 -> suit.getComp()
            3 -> {
                println("Game shutdown")
                exitProcess(0)
            }
        }
    } while (input != 3)
}