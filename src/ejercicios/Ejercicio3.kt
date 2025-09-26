package ejercicios

/* Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje.
   Si le pasamos "Hola mundo" nos retornaría "odnum aloH" */

fun main() {
    var HM : String = "Hola Mundo"
    var IHM : String = ""

    for (index in 1 .. HM.length) {
        IHM += HM[HM.length - index]
    }

    print(IHM)
}