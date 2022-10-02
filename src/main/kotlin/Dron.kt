import Ordenes.Orden
import java.util.*

class Dron (var id:Int, var operativo:Boolean) {

    class Builder(var id:Int, var operativo:Boolean) {
        fun id(id: Int): Builder {
            this.id = id
            return this
        }

        fun operativo(operativo: Boolean): Builder {
            this.operativo = operativo
            return this
        }

        fun build(): Dron {
            return Dron(id, operativo)
        }
    }


}