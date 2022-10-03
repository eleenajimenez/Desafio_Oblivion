fun main(args: Array<String>) {
    var cont = 0
    var tierra = Factoria.generarTierra(3,3)

    //mostrar mapa inicial
    do {
        println("\n\n")
        Thread.sleep(1000)
        cont++
        println("TIEMPO SIMULACION: $cont SEGUNDOS")

        if(cont % 4 == 0){
            //estroperDrones
        }

        if(cont % 10 == 0){
            //Cursar ordenes
        }

        if (cont % 20 == 0){
            //sector resuelve ordenes según el tipo
        }


    } while (cont < 10000)

    //pintarResultadoFinal(tierra)

}