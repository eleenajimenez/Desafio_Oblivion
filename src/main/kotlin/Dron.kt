import java.util.*

class Dron(var id: Int?=null, var operativo: Boolean?=null) {
    var aux= 1
    class Builder(var id:Int?=null, var operativo:Boolean?=null) {
        fun id(id:Int): Builder {
            this.id = 1
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

    companion object {

    }


}