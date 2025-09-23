package Ejercicios // Define el paquete donde se encuentra este archivo

// Función que determina si un número es primo
fun esPrimo(n: Int): Boolean {
    if (n < 2) return false // Los números menores que 2 no son primos por definición
    // Recorremos desde 2 hasta la raíz cuadrada de n para buscar divisores
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false // Si encontramos un divisor exacto, no es primo
    }
    return true // Si no se encontró ningún divisor, el número es primo
}

// Función que busca pares de primos gemelos hasta un número dado
fun primosGemelos(hasta: Int): List<Pair<Int, Int>> {
    val gemelos = mutableListOf<Pair<Int, Int>>() // Lista mutable para almacenar los pares encontrados
    for (i in 2..hasta) {
        // Verificamos si i y i+2 son primos
        if (esPrimo(i) && esPrimo(i + 2)) {
            gemelos.add(Pair(i, i + 2)) // Si ambos son primos, los añadimos como par gemelo
        }
    }
    return gemelos // Retornamos la lista completa de pares gemelos encontrados
}

// Función principal que muestra un menú interactivo al usuario
fun main() {
    var opcion: Int? // Variable para almacenar la opción elegida por el usuario

    // Bucle que se repite hasta que el usuario elige salir (opción 3)
    do {
        // Mostramos el menú de opciones
        println("\n--- Menú ---")
        println("1. Verificar si un número es primo")
        println("2. Mostrar primos gemelos hasta un número")
        println("3. Salir")
        print("Elige una opción: ")

        // Leemos la opción del usuario y la convertimos a entero de forma segura
        opcion = readLine()?.toIntOrNull()

        // Evaluamos la opción elegida usando una estructura when
        when (opcion) {
            1 -> { // Opción para verificar si un número es primo
                print("Introduce un número: ")
                val num = readLine()?.toIntOrNull() // Leemos el número a verificar
                if (num != null) {
                    // Mostramos si el número es primo o no
                    println("$num ${if (esPrimo(num)) "es primo" else "no es primo"}")
                } else {
                    println("Entrada no válida.") // Mensaje si la entrada no es un número válido
                }
            }
            2 -> { // Opción para buscar primos gemelos hasta un límite
                print("Buscar primos gemelos hasta: ")
                val limite = readLine()?.toIntOrNull() // Leemos el límite superior
                if (limite != null && limite >= 2) {
                    val gemelos = primosGemelos(limite) // Obtenemos los pares gemelos
                    if (gemelos.isEmpty()) {
                        println("No se encontraron primos gemelos.") // Si no hay resultados
                    } else {
                        println("Primos gemelos encontrados:")
                        // Mostramos cada par encontrado
                        gemelos.forEach { println("${it.first} y ${it.second}") }
                    }
                } else {
                    println("Entrada no válida.") // Mensaje si la entrada no es válida
                }
            }
            3 -> println("¡Hasta luego!") // Opción para salir del programa
            else -> println("Opción no válida.") // Mensaje si la opción no está en el menú
        }
    } while (opcion != 3) // El bucle se repite mientras no se elija salir
}
