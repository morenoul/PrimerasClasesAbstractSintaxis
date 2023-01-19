package com.example.helloandroidstudio

class Programmer(
    val name:String,
    var age: Int,
    val languajes: Array<Languaje>,
    val friends:Array<Programmer>?=null)
{
    enum class Languaje{
        KOTLIN,
        JAVA,
        HTML,
        CSS
    }

    fun code(){ //funcion para recorrer el array del atributo lengujes
        for(i: Languaje in languajes){
            println("Estoy programando en $i") //printa la frase con cada array
        }
    }

}