package model

class View {
    fun ejecutable(){
        var series = arrayOf<SeriesModel>()
        var vidjue = arrayOf<VideoJuegosModel>()

        var serie1 = SeriesModel("Pokemon", "Gamefreak")
        var serie2 = SeriesModel("Dragon Ball", "TobeyAnimatiosn")
        var serie3 = SeriesModel("Cup head", "Netflix")
        var serie4 = SeriesModel("Dragon Ball", "TobeyAnimatiosn")
        var serie5 = SeriesModel("Dragon Ball", "TobeyAnimatiosn")

        var vj1 = VideoJuegosModel("Hollow Knight",20)
        var vj2 = VideoJuegosModel("Cup Head",20)
        var vj3 = VideoJuegosModel("Pokemon Legends",10)
        var vj4 = VideoJuegosModel("Super Mario Bros",3)
        var vj5 = VideoJuegosModel("Super Mario 64",6)

        series = series.plus(serie1)
        series = series.plus(serie2)
        series = series.plus(serie3)
        series = series.plus(serie4)
        series = series.plus(serie5)

        vidjue = vidjue.plus(vj1)
        vidjue = vidjue.plus(vj2)
        vidjue = vidjue.plus(vj3)
        vidjue = vidjue.plus(vj4)
        vidjue = vidjue.plus(vj5)

        serie1.entregar()
        serie3.entregar()
        serie5.entregar()

        vj2.entregar()
        vj4.entregar()

        var cont : Int = 0
        var cont2 : Int = 0
        var cont3: Int

        for (i in series.indices) {
            if (series[i].entregado == true) cont++
            series[i].devolver()
        }

        for (i in vidjue.indices){
            if (vidjue[i].entregado == true) cont2++
            vidjue[i].devolver()
        }

        cont3 = cont + cont2
        println("Series y Videojuegos entregados = $cont3")
    }
}