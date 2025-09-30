package ejercicios

/* Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje.
   Si le pasamos "Hola mundo" nos retornaría "odnum aloH" */

fun main() {
    val hM = "Hola Mundo"
    var iHM = ""
    for (index in 1 .. hM.length) { iHM += hM[hM.length - index] }
    print(iHM)
}