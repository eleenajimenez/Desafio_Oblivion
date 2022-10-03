import Tierra.Cuadrante
import Tierra.Tet
import Tierra.Tierra
import kotlin.random.Random

class Factoria {

    fun generarTierra(filas:Int, columnas:Int): Tierra {
        var tablero = Array(filas){Array<Cuadrante>(columnas){Cuadrante()} }
        return Tierra(tablero)
    }

    fun addDron(tet:Tet, numDrones:Int){
        for (i in 1 .. numDrones){
            var dron = Dron.Builder().id(i).operativo(true).build()
            tet.drones.add(dron)
        }
    }

    fun generarPersonajes(numPersonajes:Int){

    }

    fun factoriaOrdenes(numOrdenes:Int):ArrayList<Orden>{
        var items = ArrayList<Item>(0)
        for (item in 1..numItems){
            var tipo = Random.nextInt(1,4)
            when(tipo){
                1-> items.add(Item(Tipo.ARMAS, Random.nextInt(50,100)))
                2-> items.add(Item(Tipo.MEDICINA, Random.nextInt(50,100)))
                3-> items.add(Item(Tipo.TRAMPA,0))
            }
        }
        return items
    }
}


