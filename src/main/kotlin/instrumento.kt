interface Instrumento {


    var melodia: MutableList<Nota>

    /**
     * @param incorporaNota sirve para añadir de la clase Nota a la lista mutable de arriba.
     */
    fun incorporaNota(nota: Nota) {
        melodia.add(nota)
    }

    /**
     * @param reset sirve para limpiar la lista mutable de notas.
     */
    fun reset() = melodia.clear()

    /**
     * @param play sirve recorrer la lista mutable iniciada con la var melodia la lista de notas
     * y que se recorra con un bucle forEach para que luego imprima por pantalla el valor de cada nota.
     */
    fun play() {
        println("Tocando instrumento")
        melodia.forEach { nota ->
            when (nota) {
                Nota.DO -> print("do ")
                Nota.RE -> print("re ")
                Nota.MI -> print("mi ")
                Nota.FA -> print("fa ")
                Nota.SOL -> print("sol ")
                Nota.LA -> print("la ")
                Nota.SI -> print("si ")
            }
        }
        println("")
    }

}