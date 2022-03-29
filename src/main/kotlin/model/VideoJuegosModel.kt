package model

class VideoJuegosModel : Entregable {
    var titulo : String = ""
    var HEstimadas : Int = 10
    var entregado : Boolean = false
    var genero : String = ""
    var compannia : String = ""

    constructor()

    constructor(titulo : String, HEstimadas : Int){
        this.titulo = titulo
        this.HEstimadas = HEstimadas
    }

    constructor(titulo : String, HEstimadas : Int, genero : String, compannia : String){
        this.titulo = titulo
        this.HEstimadas = HEstimadas
        this.genero = genero
        this.compannia = compannia
    }

    override fun entregar(){
        this.entregado = true
    }

    override fun devolver(){
        this.entregado = false
    }

    override fun isEntregado() : Boolean{
        return this.entregado //CAMBIAR
    }
}