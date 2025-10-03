package ejercicios

/*
*
* Enunciado:
*
* Escribe una función llamada filtrarNumerosPares que tome una lista de números enteros y
* devuelva una nueva lista que contenga solo los números pares en el mismo orden en que aparecen en la lista original.
*
* No debes modificar la lista original.
*
 */

fun main() {
    val lista: List<Int> = listOf(1, 3, 5, 4, 54, 78, 2, 324, 4, 99, 101, 100)
    print(filtrarNumeroPersona(lista))
}
fun filtrarNumeroPersona (lista : List<Int>) : List<Int> {
    return lista.filter {it % 2 == 0}
}
