class Suit : IData {
    override fun getPlayer(): Any {
        print("Pilihan pemain 1 : ")
        var pemain1 = readLine()

        print("Pilihan pemain 2 : ")
        var pemain2 = readLine()

        if ((pemain1!!.toLowerCase().equals("batu") && pemain2!!.toLowerCase().equals("gunting")) ||
            (pemain1!!.toLowerCase().equals("gunting") && pemain2!!.toLowerCase().equals("kertas")) ||
            (pemain1!!.toLowerCase().equals("kertas") && pemain2!!.toLowerCase().equals("batu"))
        ) {
            println("Hasil  :")
            println("Pemain 1 Menang!!")
        } else if ((pemain1!!.toLowerCase().equals("gunting") && pemain2!!.toLowerCase().equals("batu")) ||
            (pemain1!!.toLowerCase().equals("kertas") && pemain2!!.toLowerCase().equals("gunting")) ||
            (pemain1!!.toLowerCase().equals("batu") && pemain2!!.toLowerCase().equals("kertas"))
        ) {
            println("Hasil  :")
            println("Pemain 2 Menang!!")
        } else {
            println("Draw!!")
        }
        return 0
    }

    override fun getComp(): String {
        return "Menang Compt"
    }

}