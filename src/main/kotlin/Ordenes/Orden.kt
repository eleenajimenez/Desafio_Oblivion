package Ordenes

import java.util.Date

class Orden (var fecha:Date?= null, var completado:Boolean?= null,  var cuadrante_dest:Array<Any?>?= null) {


    class Builder(var fecha:Date?= null, var completado:Boolean?= null,  var cuadrante_dest:Array<Any?>?= null){
        fun fecha(fecha: Date):Builder{
            this.fecha= fecha
            return this
        }
        fun completado(completado: Boolean):Builder{
            this.completado= completado
            return this
        }
        fun cuadrante_dest(cuadrante_dest: Array<Any?>):Builder{
            this.cuadrante_dest= cuadrante_dest
            return this
        }

        fun build():Orden{
            return Orden(fecha, completado, cuadrante_dest)
        }
    }


    override fun toString(): String {
        return "Orden => fecha:" + this.fecha + ", Completado: " + this.completado + ", Cuadrante de destino: " + this.cuadrante_dest"
    }
}