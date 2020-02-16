import javax.swing.Icon
import kotlin.system.exitProcess

class Main {
    companion object : ICallback {
        @JvmStatic
        fun main(args: Array<String>) {
            var input: Int
            //Menu for game with do while
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
                val suit = Suit(this)
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

        override fun cetakHasilVsPlayer1(pemain1: String, pemain2: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1.toUpperCase()}")
            println("Pemain 2 : ${pemain2.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Pemain 1 Menang!!")
            println("_____________________")
        }

        override fun cetakHasilVsPlayer2(pemain1: String, pemain2: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1.toUpperCase()}")
            println("Pemain 2 : ${pemain2.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Pemain 2 Menang!!")
            println("_____________________")
        }

        override fun cetakHasilVsComp1(pemain1: String, random: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1.toUpperCase()}")
            println("Komputer : ${random.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Komputer Menang !!")
            println("_____________________")
        }

        override fun cetakHasilVsComp2(pemain1: String, random: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1.toUpperCase()}")
            println("Komputer : ${random.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Pemain 1 Menang !!")
            println("_____________________")
        }

        override fun cetakHasilDrawPlayer(pemain1: String, pemain2: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1!!.toUpperCase()}")
            println("Pemain 2 : ${pemain2!!.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Draw !!")
            println("_____________________")
        }

        override fun cetakHasilDrawComp(pemain1: String, random: String) {
            println("_____________________")
            println("Pemain 1 : ${pemain1.toUpperCase()}")
            println("Pemain 2 : ${random.toUpperCase()}")
            println("_____________________")
            println("Hasil : ")
            println("Draw !!")
            println("_____________________")
        }
    }
}
