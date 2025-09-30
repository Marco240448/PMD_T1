package ejercicios

/*
 * Enunciado:
 *
 * Escribe un programa en Kotlin que realice lo siguiente:
 *
 * Crea una lista llamada nombres que contenga al menos 5 nombres de personas.
 *
 * Escribe una función llamada longitudPromedio que tome la lista de nombres como parámetro
 * y devuelva la longitud promedio de los nombres en la lista como un número decimal
 * (puede haber nombres de diferentes longitudes en la lista).
 *
 * Llama a la función longit
 */

fun main() {
    val names = listOf("Ana", "Juan", "María", "Luis", "Elena")
    fun longitudPromedio(namesList : List<String>) : Double { if (names.isEmpty()) { return 0.0 }
        return namesList.sumOf {it.length}.toDouble() / namesList.size }
    print(longitudPromedio(names))
}