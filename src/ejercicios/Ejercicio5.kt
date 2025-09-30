package ejercicios

/*
 * Escribe una función que reciba dos palabras y retorne verdadero o falso según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Casos de prueba:
 *
 * Roma - Amor -> true
 * Amol - Amor -> false
 * Amor - Amol -> false
 *
 */

fun main() = println(comprobador(",,,,", ",,,,"))
private fun comprobador(pal1 : String, pal2 : String) : Boolean {
    var nPal = ""
    for (index in 1..pal1.length) { nPal += pal1[pal1.length - index] }
    return nPal.lowercase() == pal2.lowercase()
}