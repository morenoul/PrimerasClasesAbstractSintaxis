package com.example.helloandroidstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

    //SINTAXIS
        //variablesYConstantes()
        //tiposDeDatos()
        //sentenciaIf()
        //sentenciaWhen()
        //arrays()
        //mapsDiccionarios()
        //loops()
        //nullSafety()
        //funciones()
        //clases()

    //ENCAPSULAMIENTO Ejercicio vehiculos
        ejercicioAbstract()
    //EJERCICIOS ANIDAMINETO
        //callCliente()
    // EJERCICIOS ANIDAMINETO
    }
    private fun variablesYConstantes() {
        //CREA VARIABLE
        //variable + nombreVariable + designacionDeVariable + cadenaDeTexto
        var name : String = "Marc" //manera larga
        var apellido1 = "Moreno"
        var apellido2 = "Puig"

        println(name)
        println(name +(" ") +apellido1 +apellido2)

        var direccion = "fonden"
        println(direccion)
        var num2 = direccion
        println(num2)
        direccion = "Holatigre"
        println(direccion)

        //CREA CONSTANTE
        var phrase1 = "Esto es una variable"
        val phrase2 = "Esto es una constante"
        println(phrase1)
        //phrase = "Saludos"        Unaconstante no puede actualizar su valor
        phrase1 = phrase2 //lo que hay en la CONSTANTE phrase2 se asigna a la VARIABLE phrase1
        println(phrase1)
        val phrase3 = phrase1 //lo que hay en la VARIABLE phrase1 se asigna a la nueva variable phrase3
    }
    private fun tiposDeDatos (){
        //String
        val myString1 = "This is a String"
        val myString2 = "Que dise panita"
        val myString3 = myString1 + " " + myString2 //Concatenar
        val myString4 = "$myString1 $myString2" //mas rapida
        println(myString4)
        //Enteros - Byte,Short,Int,Long
        val myInt1:Int = 1
        val myInt2 = 4
        val myInt3 = myInt1 + myInt2
        println(myInt3)
        //Decimales -Float,Double
        val myDouble1 = 1.0
        val myDouble2 = 1.2
        val myInt4 = 3
        println(myDouble1+myDouble2+myInt4)
        //Boolean
        val myBool1 : Boolean = false
        val myBool2 = false
        println(myBool1==myBool2)
        println(myBool1&&myBool2)
    }
    private fun sentenciaIf () {
        //   Operadores condicionales
        //   > mayor que
        //   < menor que
        //   >= (> =) mayor o igual que
        //   <= (< =) menor o igual que
        //   == (= =) igualdad
        //   != (! =) desigualdad

        //   Operadores lógicos
        //   && operador "y"
        //   || operador "o"
        //   ! operador "no"
        val myNumber1 = 10
        if (myNumber1<10) {
            println("$myNumber1 es menor que 10") //concadenacion con el simbolo $
        }
        else if (myNumber1==10) {
            println("$myNumber1 es igual a 10")
        }
        else {
            println("$myNumber1 es mayor a 10")
        }
        //forma abreviada

        val myNumber2 = 543
        if (myNumber2<100) println("$myNumber2 es menor que 100") //concadenacion con el simbolo $
        else if (myNumber2==100)println("$myNumber2 es igual a 100")
        else println("$myNumber2 es mayor a 100")

        val myNumber3 = 51
        if ((myNumber3>=1 && myNumber3<=10))
        {println("El numero esta entre 1 incluido y 10 incluido")}
        else if (!(myNumber3>=50 && myNumber3<=100) || myNumber3==200)
        {println("El numero no esta entre 50 incluido y 100 incluido pero podria ser el 200")}
    }
    private fun sentenciaWhen (){

        //When con String
        val country ="Rusia"
        when (country){
            "Spain" -> {
                println("The lenguaje is spanish")
            }
            "France" -> {
                println("The lenguaje is freanch")
            }
            "Portugal" ->{
                println("The lenguaje is portuguese")
            }else ->{
                println("I don't know wich lenguaje are you speak")
            }
        }
        //When con Int
        var age = 10
        when (age) {
            0,1,2-> {
                println("you are a baby")
            } in 3..11 ->{
                println("you are a child")
            } in 12..18 ->{
                println("you are adolescent")
            } in 19..70 -> {
                println("you are adult")
            } in 70..99 -> {
                println("you are elderly")
            } else ->{
                println("you are super elderly")
            }
        }
    }
    private fun arrays(){

        val name = "Marc"
        val surname = "Moreno Puig"
        val comany = "Raser"
        val age = "32"

        //Creación de un array
        val myArray : ArrayList <String> = arrayListOf<String>()
        //val myArray = arrayListOf<String>()

        //Añadir datos de 1 en 1
        myArray.add(name)
        myArray.add(surname)
        myArray.add(comany)
        myArray.add(age)
        myArray.add(age) //Los ARRAYS admiten repetidos
        println(myArray)

        //Añadir conjunto de datos
        myArray.addAll(listOf("addAll1","addAll2"))
        println(myArray)

        //Acceso a datos
        println(myArray[1]) // forma corta sin crear atributo
        val mySurname = myArray[1]
        println(mySurname)// forma larga creando atributo

        //Substituir datos
        myArray[4] ="you need to trave to "
        myArray[5] ="Phillipines"
        println(myArray)

        //Borrar datos
        myArray.removeAt(6) //borra el array num 6 (addAll2)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }

        //Otras operaciones
        println(myArray.count())    //enumera todos los elementos del array
       //myArray.clear()             //Borra todos los elementos del arra
       //println(myArray.count())
        println(myArray.first())    //Printa el primer elemento del array
        println(myArray.last())     //Printa el ultimo elemento del array

        var myNumericArray:IntRange = 1..30
        myNumericArray.forEach{
            println(it)
        }
    }
    private fun mapsDiccionarios(){

        //Sintaxis
        var myMap : Map<String,Int> = mapOf() //Creacion de mapa de 0 elementos -  <"clave",valoe>

        //Añadir elementos
        myMap =mapOf("Elena" to 1, "Rosa" to 2, "Cris" to 3)
        println(myMap)
        myMap =mapOf("Marc Moreno Puig" to 1, "Toni Elias Hernandez" to 2, "Lorena Feli Na" to 3)  //Machaca el map anterior
        println(myMap)

        //añadir mas valores
        myMap = mutableMapOf("Marc Moreno Puig" to 1, "Toni Elias Hernandez" to 2, "Lorena Feli Na" to 3)
        myMap["Yonas"] = 4
        myMap.put("Maria", 5)
        println(myMap)

        //Susituye,reescribe valor de la clave
        myMap["Yonas"] = 6      //Cambia la clave de Yonas 4, por 6
        println(myMap)

        //Acceso a un dato
        println(myMap["Maria"])

        //Borrar datos
        myMap.remove("Brais")
        println(myMap)
    }
    private fun loops(){
        val myArray2:List<String> = listOf("Monday","Tuesday","Wednesday", "Thursday", "Friday","Saturday","Sunday")
        val myMap2 = mutableMapOf(1 to "Marc", 2 to "Nuria", 3 to "Montse")

        for (i:String in myArray2){
            println(i)
        }
        for (i: MutableMap.MutableEntry<Int,String> in myMap2){
            println("${i.key}-${i.value}")
        }
        for (i:Int in 1..10) {
            println(i)
        }
        for (i:Int in 1 until 10) { //el ultimo numero no lo imprime
            println(i)
        }
        for (i:Int in 0..10 step 2) { //Recorre el bucle de 2 en 2
            println(i)
        }
        for (i:Int in 18 downTo 0 step 3){
            println(i)
        }
        var myNumericArray:IntRange = 1..30
        for (i:Int in myNumericArray) {
            println(i)
        }
        myNumericArray.forEach{
            println(it)
        }
        var number = 0
        while (number < 10) {
            number += 2
            println(number)
        }


    }
    private fun nullSafety(){

        //Seguridad contra nulos
        var myString = "MoureDev"
        // myString = null Esto daría un error de compilación
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "MoureDev null safety"
        mySafetyString = null
        println(mySafetyString)

        //mySafetyString = "Suscríbete!"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call

        println(mySafetyString?.length)

/*        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }*/

    }
    fun funciones() {
        sayHello()
        sayHello()
        sayHello()
        sayMyName(name= "Marc")  //reutilizamos la logica y modificandola con un parametro de entrada
        sayMyNameAndMyAge(name = "Marc", age = 32)
        val sum = sumTwoNumbers(firstNum = 1, secondNum = 2)
        println(sum)
        println(sumTwoNumbers(firstNum = 1, secondNum = 2)) //Simplificado
    }
        //Funcion simple
        fun sayHello(){
        println("Hellow!!!")
    }
        //Funciones con parametro de entrada
        fun sayMyName(name: String){
            println("My name is $name")
        }
        fun sayMyNameAndMyAge (name: String, age: Int) {
        println("My name is $name and I'm $age years old")
    }
        //Funciones con valor de retorno
        fun sumTwoNumbers(firstNum: Int, secondNum: Int):Int        {
        val sum = firstNum + secondNum
        return sum
    }
    fun clases(){
        val programmer1 = Programmer(name="Marc", age=32, arrayOf(Programmer.Languaje.KOTLIN, Programmer.Languaje.JAVA))
        println(programmer1.name)
        println("${programmer1.name} ${programmer1.age}")
        programmer1.age = 28 // para poder cambiar el valor necesitamos cambiar a tipo variable el atributo ege de la clase Porgrammer

        val programmer2 = Programmer("Sara", 23, arrayOf(Programmer.Languaje.HTML, Programmer.Languaje.JAVA), arrayOf(programmer1))
        programmer1.code()  //Instanciamos funcion code() de la clase Programmer
        programmer2.code()
        println("${programmer2.friends?.first()?.name} es amigo de ${programmer2.name}")

    }

    fun ejercicioAbstract(){
        val coche1 = Coche(model = "Ford", color = "silver", peso = 1500, max_velocity = 200.05)
        coche1.detalles()
        coche1.arrancar()
        coche1.detalles()
        coche1.parar()
        coche1.detalles()
    }
    fun callCliente (){
        //Iniciar el cliente
        var alicia = Cliente("Alicia", Estado.ABIERTA, arrayListOf())
        //añadir producto
        alicia.añadirProducto(5.0,10)
        alicia.añadirProducto(3.0,10)
        alicia.añadirProducto(1.0,10)
        println(alicia.callTotal())
    }

}


