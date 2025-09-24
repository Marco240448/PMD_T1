package ejercicios

fun main() {
    var saldo = 0.0

    println("Bienvenido a tu banco virtual")
    println("=============================")

    fun ingresarDinero(cantidad: Double): Double {
        return saldo + cantidad
    }

    fun sacarDinero(cantidad: Double): Double {
        return if (cantidad <= saldo) saldo - cantidad else saldo
    }

    var option: Int?

    do {
        println(
            """
            Elija una opción:
            1) Ver saldo
            2) Ingresar dinero
            3) Sacar dinero
            4) Salir
            =============================
            """.trimIndent()
        )

        option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> {
                println("Tu saldo actualmente es: ${String.format("%.2f", saldo)}€")
                println("=============================")
            }
            2 -> {
                print("Introduce la cantidad de dinero que quieres ingresar: ")
                val cantidad = readlnOrNull()?.toDoubleOrNull()
                if (cantidad != null && cantidad > 0) {
                    saldo = ingresarDinero(cantidad)
                    println("Has ingresado ${String.format("%.2f", cantidad)}€ con éxito")
                } else {
                    println("Cantidad inválida")
                }
                println("=============================")
            }
            3 -> {
                print("Introduce la cantidad de dinero que quieres sacar: ")
                val cantidad = readlnOrNull()?.toDoubleOrNull()
                if (cantidad != null && cantidad > 0) {
                    val nuevoSaldo = sacarDinero(cantidad)
                    if (nuevoSaldo < saldo) {
                        saldo = nuevoSaldo
                        println("Has sacado ${String.format("%.2f", cantidad)}€ con éxito")
                    } else {
                        println("Saldo insuficiente")
                    }
                } else {
                    println("Cantidad inválida")
                }
                println("=============================")
            }
            4 -> {
                println("Nos vemos en la próxima")
                println("=============================")
            }
            else -> {
                println("No has introducido una opción válida")
                println("=============================")
            }
        }
    } while (option != 4)
}
