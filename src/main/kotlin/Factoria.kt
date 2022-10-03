import Ordenes.Orden
import Ordenes.Reconocimiento
import Ordenes.Reparacion
import Tierra.Cuadrante
import Tierra.Dron
import Tierra.Tet
import Tierra.Tierra
import kotlin.random.Random

object Factoria {
    fun generarTierra(filas:Int, columnas:Int): Tierra {
        var tablero = Array(filas){Array<Cuadrante>(columnas){ Cuadrante() } }
        return Tierra(tablero)
    }

    fun addDrones(tet: Tet, numDrones:Int){
        for (i in 1 .. numDrones){
            var dron = Dron.Builder().id(i).operativo(true).build()
            tet.drones.add(dron)
        }
    }

    fun generarPersonajes(numPersonajes:Int){

    }

    fun factoriaOrdenes(numOrdenes:Int):ArrayList<Orden>{
        var ordenes = ArrayList<Orden>(0)
        for (item in 1..numOrdenes){
            var tipo = Random.nextInt(1,4)
            when(tipo){
                1-> Ordenes.add(Reparacion.Builder().completado(false))
                2-> Ordenes.add(Reconocimiento.Builder().ha_encontrado())
            }
        }
        return ordenes
    }
}