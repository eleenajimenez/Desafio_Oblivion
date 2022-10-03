package Tierra

import Personajes.Mecanico
import Personajes.Supervisora
import kotlin.random.Random

class Cuadrante (){

    var drones : ArrayList<Dron> = ArrayList(0)
    var mecanico: Mecanico? = null
    var supervisora:Supervisora? = null

    constructor(d:ArrayList<Dron>, pos_x:Int, pos_y:Int) : this() {
        this.drones= d
        this.supervisora= Supervisora.Builder().nombre("vika", pos_x, pos_y).build()
        this.mecanico= Mecanico.Builder().nombre("Jack", pos_x, pos_y).build()
    }

    fun estropearDrones(tierra:Tierra){
        var aleatorio= Random.nextInt(0,100)
        for (i in 0.. tierra.tierra.size)
            for(j in 0 .. tierra.tierra.size[i]){
                if (aleatorio <=20){
                    //tierra.tierra[i].Cuadrante.Dron.Estropeado = true
                }
            }

    }

}


