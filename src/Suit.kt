class Suit(private val iCallback: ICallback) : IData {
    //Player versus player
    override fun getPlayer() {
        var pilihan = arrayListOf<String>("batu","kertas","gunting")
        print("Pilihan pemain 1 (kertas, gunting, batu) : ")
        var pemain1 = readLine()

        print("Pilihan pemain 2 (kertas, gunting, batu) : ")
        var pemain2 = readLine()

        //validation
        if (pemain1!!.isNotEmpty() && pemain2!!.isNotEmpty()) {
            //logic
            if (pemain1 == pemain2) {
                iCallback.cetakHasilDrawPlayer(pemain1, pemain2)
            } else if ((pemain1.toLowerCase() == "batu" && pemain2!!.toLowerCase() == "gunting") ||
                (pemain1.toLowerCase() == "gunting" && pemain2!!.toLowerCase() == "kertas") ||
                (pemain1.toLowerCase() == "kertas" && pemain2!!.toLowerCase() == "batu")
            ) {
                iCallback.cetakHasilVsPlayer1(pemain1, pemain2)
            } else if ((pemain1.toLowerCase() == "gunting" && pemain2!!.toLowerCase() == "batu") ||
                (pemain1.toLowerCase() == "kertas" && pemain2!!.toLowerCase() == "gunting") ||
                (pemain1.toLowerCase() == "batu" && pemain2!!.toLowerCase() == "kertas")
            ) {
                iCallback.cetakHasilVsPlayer2(pemain1, pemain2)
            }
        } else {
           println("Masukan pilihan dengan benar!!")
        }
    }

    //Player vs computer
    override fun getComp() {
        var data = arrayListOf<String>("kertas", "gunting", "batu")
        var random = data.random()

        print("Pilihan pemain 1 (kertas, gunting, batu) : ")
        var pemain1 = readLine()

        println("Pilihan komputer (kertas, gunting, batu) : $random")

        //validation
        if (pemain1!!.isNotEmpty())  {
            //logic
            if (random == pemain1) {
                iCallback.cetakHasilDrawComp(pemain1, random)
            } else if ((random.toLowerCase() == "kertas" && pemain1.toLowerCase() == "batu") ||
                (random.toLowerCase() == "batu" && pemain1.toLowerCase() == "gunting") ||
                (random.toLowerCase() == "gunting" && pemain1.toLowerCase() == "kertas")
            ) {
                iCallback.cetakHasilVsComp1(pemain1, random)
            } else if ((random.toLowerCase() == "batu" && pemain1.toLowerCase() == "kertas") ||
                (random.toLowerCase() == "gunting" && pemain1.toLowerCase() == "batu") ||
                (random.toLowerCase() == "kertas" && pemain1.toLowerCase() == "gunting")
            ) {
                iCallback.cetakHasilVsComp2(pemain1, random)
            }
        } else {
            println("Masukan pilihan dengan benar!!")
        }
    }

}