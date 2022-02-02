class Piano:Instrumento{

    //tabla que almacena las notas a interpretar
   override var melodia = mutableListOf<Nota>()

    override fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    override fun reset() = melodia.clear()

    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    override fun play() {
        println("tocando piano")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("dooo ")
                Nota.RE -> print("reee ")
                Nota.MI -> print("miii ")
                Nota.FA -> print("faaa ")
                Nota.SOL -> print("soool ")
                Nota.LA -> print("laaa ")
                Nota.SI -> print("siii ")
            }
        }
        println("")
    }
}