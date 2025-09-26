package ejercicios

/*
 * Escribe una función que reciba dos palabras  y retorne verdadero o falso  según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Casos de prueba:
 *
 * Roma - Amor -> true
 * Amor - Amor -> false
 * Amor - Amol -> false
 *
 */

fun main() {
    println(Comprobador("roMa", "Amor"))
}

private fun Comprobador(Pal1 : String, Pal2 : String) : Boolean {
    var NPal = ""
    for (index in 1..Pal1.length) {
        NPal += Pal1[Pal1.length - index]
    }
    if (NPal.toLowerCase() == Pal2.toLowerCase()) {
        return true
    } else {
        return false
    }
}
