package ejercicios

/*
* Enunciado
*
* Escribe un programa en Kotlin que solicite al usuario dos números enteros y luego realice la división
* del primer número por el segundo número. Sin embargo, debes manejar la excepción en caso de que el segundo
* número sea igual a cero (división por cero). Debes mostrar un mensaje de error en ese caso. Y controlaremos también
* que los dos numeros solicitadas sean numeros enteros.
*
*/

fun main() {
    var num1 : Int
    var num2 : Int
    do {
        println("Introduce el divideno :")
        num1 = readlnOrNull()?.toIntOrNull()!!
        println("Introduce el divisor :")
        num2 = readlnOrNull()?.toIntOrNull()!!
        if (num2 == 0) {
            println("Recuerda que no puedes dividir entre 0 pequeño")
        }
    } while (num2 == 0)
    println(dividir(num1, num2))
}
fun dividir(num1: Int?, num2: Int?) : Double {
    return (num1!!.toDouble() / num2!!.toDouble())
}