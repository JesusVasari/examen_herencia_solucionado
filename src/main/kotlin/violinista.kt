class Violinista(unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0))  : Musico() {

    var violin = Violin()
    var partitura: Array<Nota?> = unaCancion
    set(value) {
        field = value
        violin.reset()
        value.forEach { nota ->
            i("Pianista.setPartitura","incorpora nota $nota de canción")
            nota?.let { violin.incorporaNota(nota) }
        }
    }

    init {
        partitura = unaCancion
    }

    override fun interpretar() = violin.play()
}