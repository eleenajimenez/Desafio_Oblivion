class Factoria {

    fun generarTierra(filas:Int, columnas:Int):Tierra{
        var tablero= Array<Array<Any?>>(filas) {Array<Any?>(columnas) {null} }
        return Tierra(tablero)
    }
}