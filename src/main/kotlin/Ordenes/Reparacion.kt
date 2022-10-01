package Ordenes

import java.util.*

class Reparacion(fecha: Date?= null, completado:Boolean?= null, cuadrante_dest:Array<Any?>?= null, var id_dron:Int?=null, var estado:Boolean?=null): Orden(fecha, completado, cuadrante_dest) {

    class Builder(
        var fecha: Date? = null,
        var completado: Boolean? = null,
        var cuadrante_dest: Array<Any?>? = null,
        var id_dron: Int? = null,
        var estado: Boolean? = null
    ) {
        fun id_dron(id_dron: Int?): Builder {
            this.id_dron = id_dron
            return this
        }

        fun estado(estado: Boolean?): Builder {
            this.estado = estado
            return this
        }

        fun build(): Reparacion {
            return Reparacion(fecha, completado, cuadrante_dest, id_dron, estado)
        }
    }

    override fun toString(): String {
        return "Reparacion: (${super.toString()}, id_dron:  " + this.id_dron + ", estado: " + this.estado
    }

}
