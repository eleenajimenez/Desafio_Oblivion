package Personajes

class Supervisora (nombre:String, pos_x:Int, pos_y:Int) : Personaje(nombre, pos_x, pos_y){

    class Builder(var nombre: String, var pos_x: Int, var pos_y: Int){
        fun nombre(nombre: String= "Vika"): Builder {
            this.nombre= nombre + "_" + pos_x.toString() + "_" + pos_y.toString()
            return this
        }
    }

    override fun toString(): String {
        return super.toString()
    }

}