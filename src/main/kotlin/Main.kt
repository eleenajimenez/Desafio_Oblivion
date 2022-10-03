fun main(args: Array<String>) {
    var cont = 0

    println("BIENVENIDOS A LOS JUEGOS DEL HAMBRE")
    println("ESTE SERA EL MAPA DONDE JUGARAN NUESTROS TRIBUTOS")
    pintarTierraVacio(Tierra)
    println("Y ESTE ES EL MAPA UNA VEZ INICIALIZADOS LOS ITEMS Y LOS TRIBUTOS")
    pintarMapaInicializacion(mapa)
    //pintarMapaDetalle(mapa)

    mapa.comprobarTributosVivos()
    do {
        println("\n\n")
        Thread.sleep(1000)
        cont++
        println("TIEMPO SIMULACION: $cont SEGUNDOS")

        if(cont % 2 == 0){
            simularMovimiento(mapa)
            //pintarMapaDetalle(mapa)
        }

        if(cont % 5 == 0){
            repeat(4) {
                mapa.rellenarItems()
            }
            pintarResultado(mapa)
        }

        mapa.comprobarTributosVivos()
    } while (mapa.getTributosVivos().size > 1)

    pintarResultadoFinal(mapa)
}