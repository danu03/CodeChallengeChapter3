import java.util.*

class Suit : IData {

    override fun getPlayer() {
        print("Pilihan pemain 1 : ")
        var pemain1 = readLine()

        print("Pilihan pemain 2 : ")
        var pemain2 = readLine()

        if (pemain1 == pemain2){
            println("Draw !")
        }else if ((pemain1!!.toLowerCase() == "batu" && pemain2!!.toLowerCase() == "gunting") ||
            (pemain1!!.toLowerCase() == "gunting" && pemain2!!.toLowerCase() == "kertas") ||
            (pemain1!!.toLowerCase() == "kertas" && pemain2!!.toLowerCase() == "batu")
        ) {
            println("Hasil  :")
            println("Pemain 1 Menang!!")
        } else if ((pemain1!!.toLowerCase() == "gunting" && pemain2!!.toLowerCase() == "batu") ||
            (pemain1!!.toLowerCase() == "kertas" && pemain2!!.toLowerCase() == "gunting") ||
            (pemain1!!.toLowerCase() == "batu" && pemain2!!.toLowerCase() == "kertas")
        ) {
            println("Hasil  :")
            println("Pemain 2 Menang!!")
        }
    }

    override fun getComp() {
        var data = arrayListOf<String>("kertas", "gunting", "batu")
        var random = data.random()

        print("Pilihan pemain 1 : ")
        var pemain1 = readLine()

        println("Pilihan komputer : $random")

        if (random == pemain1){
            println("Draw !!")
        }else if ((random.toLowerCase() == "kertas" && pemain1!!.toLowerCase() == "batu") ||
            (random.toLowerCase() == "batu" && pemain1!!.toLowerCase() == "gunting") ||
            (random.toLowerCase() == "gunting" && pemain1!!.toLowerCase() == "kertas")) {
            println("Komputer Menang !!")
        } else if ((random.toLowerCase() == "batu" && pemain1!!.toLowerCase() == "kertas") ||
            (random.toLowerCase() == "gunting" && pemain1!!.toLowerCase() == "batu") ||
            (random.toLowerCase() == "kertas" && pemain1!!.toLowerCase() == "gunting")){
            println("Pemain 1 Menang !!")
        }
    }

}