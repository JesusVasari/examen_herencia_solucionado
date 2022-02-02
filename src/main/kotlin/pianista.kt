class Pianista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : Musico() {

    val piano = Piano()
    val violin = Violin()
    var partitura: Array<Nota?> = unaCancion
        set(value) {
            field = value
            piano.reset()
            value.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { piano.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    //Un Pianista, podrá tocar (método play) cualquier instrumento (Instrumento)

    override fun interpretar() =piano.play()



}