package com.example.helloandroidstudio

//Esta clase tiene un nombre String, un estado de la factura tipo Enum (sera una clase enum) y una linea de factura que es una coneccion de datos, se pueden añadir facturas
class Cliente (val nombre:String, private val estado: Estado, private val lineaFactura:ArrayList<LineaFactura>) {
    var total= 0.0

    fun callTotal():Double{
        var total= 0.0
        lineaFactura.forEach{
                a: LineaFactura ->
          total += a.total()
        }
        return total
    }

    fun markAsPaid():String{
        return "tu factura esta +$estado"
    }

    fun añadirProducto(uniCost:Double, quantity:Int){
        lineaFactura.add(LineaFactura(uniCost, quantity))
    }

    class LineaFactura(val uniCost:Double, val quantity:Int){       //clase anidada

        var IVA:Double = 0.21

        fun total():Double{
            return (uniCost*quantity) + (uniCost*quantity)*IVA
        }

    }

}
