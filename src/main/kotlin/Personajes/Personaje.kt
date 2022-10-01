package Personajes

import Ordenes.Orden
import java.util.*

open class Personaje(var nombre:String, var pos_x:Int, var pos_y:Int) {

    open class Builder(var nombre:String, var pos_x: Int, var pos_y: Int){
        fun nombre(nombre: String): Builder {
            this.nombre= nombre + "_" + pos_x.toString() + "_" + pos_y.toString()
            return this
        }

        fun pos_x(pos_x: Int):Builder{
            this.pos_x= pos_x
            return this
        }

        fun pos_y(pos_x: Int):Builder{
            this.pos_y= pos_y
            return this
        }

    }

    override fun toString(): String {
        return "Personaje => Nombre: " + this.nombre
    }
}