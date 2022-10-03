package Personajes

class Supervisora (var nombre:String?= null, var pos_x:Int?=null, var pos_y:Int?= null){

    class Builder(var nombre: String?=null, var pos_x: Int?=null, var pos_y: Int?=null){
        fun nombre(nombre: String, pos_x: Int, pos_y: Int): Builder {
            this.nombre= nombre + "_" + pos_x.toString() + "_" + pos_y.toString()
            return this
        }

        fun build():Supervisora{
            return Supervisora(nombre)
        }

    }

    override fun toString(): String {
        return "Supervisora => Nombre: " + this.nombre
    }

    companion object {
        fun Builder(): Supervisora.Builder {

        }
    }


}