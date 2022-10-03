package Tierra

class Tet{
    var drones : ArrayList<Dron> = ArrayList(200)
    init {
        mandarDrones( 100) //para empezar enviando los 100 drones
    }

    fun mandarDrones(tet: Tet, numDrones:Int){
        for (i in 0..numDrones){
            var aleatorio: Dron = drones[i]
            Factoria.addDrones(tet,numDrones)
            this.drones.remove(aleatorio)

        }
    }



    override fun toString(): String {
        return "Drones: " + drones
    }


}