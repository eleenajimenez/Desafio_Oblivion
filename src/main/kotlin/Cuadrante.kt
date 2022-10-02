import Ordenes.Orden
import Personajes.Personaje

class Cuadrante (var cuadrante:Array<Array<Any?>>){
    var drones : ArrayList<Dron> = ArrayList(0)
    var ordenes:ArrayList<Orden> = ArrayList(0)
    var personajes:ArrayList<Personaje> = ArrayList(0)


    fun addDron(dron: Dron?) {
        var fila = 0
        var columna = 0
        do {
            fila = (cuadrante.indices).random()
            columna = (cuadrante[0].indices).random()
        } while (cuadrante[fila][columna] != dron)
        cuadrante[fila][columna] = dron
        if (dron != null) {
            drones.add(dron)
        }
    }

    fun addOrden(orden: Orden){
        var fila =0
        var columna = 0
        do{
            fila = (cuadrante.indices).random()
            columna = (cuadrante[0].indices).random()
        } while (cuadrante[fila][columna] != orden)
        cuadrante[fila][columna]= orden
        ordenes.add(orden)
    }

    fun addPersonaje(personaje: Personaje){
        var fila =0
        var columna = 0
        do{
            fila = (cuadrante.indices).random()
            columna = (cuadrante[0].indices).random()
        } while (cuadrante[fila][columna] != personaje)
        cuadrante[fila][columna]= personaje
        personajes.add(personaje)
    }


}