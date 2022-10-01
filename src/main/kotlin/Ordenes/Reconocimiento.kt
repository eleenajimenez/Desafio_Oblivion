package Ordenes

import java.util.*

class Reconocimiento(fecha:Date?= null, completado:Boolean?= null, cuadrante_dest:Array<Any?>?= null, var area_conocer:Int?=null, var ha_encontrado:String?=null): Orden(fecha, completado, cuadrante_dest) {

    class Builder(var fecha:Date?= null, var completado:Boolean?= null, var cuadrante_dest:Array<Any?>?= null, var area_conocer:Int?=null, var ha_encontrado:String?=null){
        fun area_conocer(area_conocer: Int?): Builder {
            this.area_conocer= area_conocer
            return this
        }
        fun ha_encontrado(ha_encontrado: String?): Builder {
            this.ha_encontrado= ha_encontrado
            return this
        }

        fun build():Reconocimiento{
            return Reconocimiento(fecha, completado, cuadrante_dest, area_conocer, ha_encontrado)
        }
    }

    override fun toString(): String {
        return "Reconocimiento: (${super.toString()}, Área a conocer: " + this.area_conocer + ", Que ha encontrado: " + this.ha_encontrado
    }
}