package Personajes

class Mecanico (var nombre:String?=null, var pos_x:Int ?=null, var pos_y:Int?=null){

    class Builder(var nombre: String?=null, var pos_x: Int?=null, var pos_y: Int?=null) {
        fun nombre(nombre: String, pos_x: Int, pos_y: Int): Builder {
            this.nombre = nombre + "_" + pos_x.toString() + "_" + pos_y.toString()
            return this
        }

        fun build():Mecanico{
            return Mecanico(nombre)
        }
    }

    override fun toString(): String {
        return "Mecánico => Nombre: " + this.nombre
    }

    companion object {
        fun Builder(): Mecanico.Builder {

        }
    }

}