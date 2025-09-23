package Ejemplos
    fun main() {

        // TIPOS DE DATOS
        /*
            •	Tipo texto (String), representados con comillas dobles
            •	Tipo carácter (Char), representados con comillas simples
            •	Tipo booleano (Boolean), con los valores true y false
            •	Tipo real (Float de 4 bytes o Double de 8 bytes, dependiendo de la precisión).
                En este caso, para constantes literales de tipo float se le debe indicar una f al final,
                como en Java: var numero = 1.345f
            •	Tipo entero (Int). Ocupa 4 bytes.
                También tenemos los tipos Short y Byte para enteros de menor tamaño
                (2 bytes y 1 byte, respectivamente)
          */

        // DECLARACION DE VARIABLES

        // INFERENCIA DE TIPO

        var nombre = "Michel"
        var numero = 123

            println(numero)
            println(nombre)

        nombre = "Juan"

            println(nombre)

        nombre = "" + 248

            println(nombre)

        var cantidad : Int = 32
        cantidad = 33
        var nota : Double = 8.75
        nota = 9.15
        var letra : Char = 'S'
        letra = 'E'
        var existe : Boolean = true
        existe = false

            println(cantidad)
            println(nota)
            println(letra)
            println(existe)
    }