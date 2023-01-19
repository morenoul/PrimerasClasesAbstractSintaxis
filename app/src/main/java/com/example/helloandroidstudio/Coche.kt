package com.example.helloandroidstudio

class Coche(model:String, color:String, peso:Int, override var max_velocity:Double): Vehiculo(model,color,peso) {

    //funcion abtracta
    override fun arrancar() {
        println("Coche arrancado")
    }
    //funcion abtracta
    override fun parar() {
        println("Coche parado")
    }
}