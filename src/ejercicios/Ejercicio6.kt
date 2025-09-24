package ejercicios

fun main() {
    val edad = arrayOf(5, 6, 15, 17, 18, 19, 20)

    fun promedioEdades(): Double {
        var suma = 0
        for (i in edad.indices) {
            suma += edad[i]
        }
        return suma.toDouble() / edad.size
    }

    fun mayorEdad(): Int {
        var mayor = edad[0]
        for (i in edad.indices) {
            if (edad[i] > mayor) {
                mayor = edad[i]
            }
        }
        return mayor
    }

    fun menorEdad(): Int {
        var menor = edad[0]
        for (i in edad.indices) {
            if (edad[i] < menor) {
                menor = edad[i]
            }
        }
        return menor
    }

    println("Menor edad: ${menorEdad()}")
    println("Mayor edad: ${mayorEdad()}")
    println("Promedio de edades: ${promedioEdades()}")
}
