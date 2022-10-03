package Tierra

import Dron
import Factoria

class Tet{
    var drones : ArrayList<Dron> = ArrayList(200)
    init {
        mandarDrones(100) //para empezar enviando los 100 drones
    }

    fun mandarDrones(numDrones:Int){
        for (i in 0..numDrones){
            var aleatorio: Dron = drones[i]
            Factoria.addDrones(drones,numDrones)
            this.drones.remove(aleatorio)

        }
    }



    override fun toString(): String {
        return "Drones: " + drones
    }


}