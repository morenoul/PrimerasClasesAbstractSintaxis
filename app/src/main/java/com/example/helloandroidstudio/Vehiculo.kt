package com.example.helloandroidstudio

abstract class Vehiculo (var model:String, var color:String, var peso: Int) {
    //variables abstractas:
    abstract var max_velocity:Double
    //funciones abstractas:
    abstract fun arrancar()
    abstract fun parar()

    //Funciones:
    fun detalles (){
        println("Modelo: $model " +
                "\nColor: $color " +
                "\nPeso: $peso" +
                "\nMaxima velocidad: $max_velocity ")
    }
}