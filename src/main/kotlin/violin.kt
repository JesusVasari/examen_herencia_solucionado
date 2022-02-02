class Violin :Instrumento{

    //tabla que almacena las notas a interpretar
    override var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("Tocando violín")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("doggg ")
                Nota.RE -> print("reggg ")
                Nota.MI -> print("miigg")
                Nota.FA -> print("faggg ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaggg ")
                Nota.SI -> print("siiggg ")
            }
        }
        println("")
    }
}