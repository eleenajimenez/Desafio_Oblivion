import java.lang.reflect.MalformedParametersException

class Factoria {

    fun generarTierra(filas:Int, columnas:Int):Tierra{
        var tablero= Array<Array<Any?>>(filas) {Array<Any?>(columnas) {null} }
        return Tierra(tablero)
    }

    fun generarDrones(numDrones:Int, tierra: Tierra){
        var drones= ArrayList<Dron>(100)
        for (i in 1 .. numDrones){
            var dron = Dron.Builder(i, true)
            drones.add(dron)
        }
    }

    fun generarPersonajes(numPersonajes:Int){

    }
}
