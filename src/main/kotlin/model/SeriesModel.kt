package model

class SeriesModel : Entregable{
    var titulo : String = ""
    var NumTemporadas : Int = 3
    var entregado : Boolean = false
    var genero : String = ""
    var creador : String = ""

    constructor()

    constructor(titulo : String, creador : String){
        this.titulo = titulo
        this.creador = creador
    }

    constructor(titulo : String, NumTemporadas : Int, genero : String, creador : String){
        this.titulo = titulo
        this.NumTemporadas = NumTemporadas
        this.genero = genero
        this.creador = creador
    }

    override fun entregar(){
        this.entregado = true
    }

    override fun devolver(){
        this.entregado = false
    }

    override fun isEntregado() : Boolean{
        return entregado //CAMBIAR
    }
}