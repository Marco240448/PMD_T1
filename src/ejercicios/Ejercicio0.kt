package ejercicios
fun esPrimo(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
fun primosGemelos(hasta: Int): List<Pair<Int, Int>> {
    val gemelos = mutableListOf<Pair<Int, Int>>()
    for (i in 2..hasta) {
        if (esPrimo(i) && esPrimo(i + 2)) gemelos.add(Pair(i, i + 2))
    }
    return gemelos
}
fun main() {
    var opcion: Int?
    do {
        println("\n--- Menú --- \n1. Verificar si un número es primo \n2. Mostrar primos gemelos hasta un número \n3. Salir")
        print("Elige una opción: ")
        opcion = readLine()?.toIntOrNull()
        when (opcion) {
            1 -> {
                print("Introduce un número: ")
                val num = readLine()?.toIntOrNull()
                if (num != null) {
                    println("$num ${if (esPrimo(num)) "es primo" else "no es primo"}")
                } else println("Entrada no válida.")
            }
            2 -> {
                print("Buscar primos gemelos hasta: ")
                val limite = readLine()?.toIntOrNull()
                if (limite != null && limite >= 2) {
                    val gemelos = primosGemelos(limite)
                    if (gemelos.isEmpty()) println("No se encontraron primos gemelos.")
                    else {
                        println("Primos gemelos encontrados:")
                        gemelos.forEach { println("${it.first} y ${it.second}") }
                    }
                } else println("Entrada no válida.")
            }
            3 -> println("¡Hasta luego!")
            else -> println("Opción no válida.")
        }
    } while (opcion != 3)
}
