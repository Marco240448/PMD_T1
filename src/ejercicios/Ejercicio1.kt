package ejercicios
fun main() { var saldo = 0.0
    println("Bienvenido a tu banco virtual \n==========================")
    fun ingresarDinero(cantidad: Double): Double { return saldo + cantidad }
    fun sacarDinero(cantidad: Double): Double { return if (cantidad <= saldo) saldo - cantidad else saldo }
    var option: Int?
    do { println("Elija una opción: \n1) Ver saldo \n2) Ingresar dinero \n3) Sacar dinero \n4) Salir \n========================== ")
        option = readlnOrNull()?.toIntOrNull()
        when (option) {
            1 -> { println("Tu saldo actualmente es: ${String.format("%.2f", saldo)}€ \n===========================") }
            2 -> { print("Introduce la cantidad de dinero que quieres ingresar: ")
                val cantidad = readlnOrNull()?.toDoubleOrNull()
                if (cantidad != null && cantidad > 0) { saldo = ingresarDinero(cantidad)
                    println("Has ingresado ${String.format("%.2f", cantidad)}€ con éxito \n==========================")
                } else { println("Cantidad inválida \n==========================") }
            }
            3 -> { print("Introduce la cantidad de dinero que quieres sacar: ")
                val cantidad = readlnOrNull()?.toDoubleOrNull()
                if (cantidad != null && cantidad > 0) { val nuevoSaldo = sacarDinero(cantidad)
                    if (nuevoSaldo < saldo) { saldo = nuevoSaldo
                        println("Has sacado ${String.format("%.2f", cantidad)}€ con éxito \n==========================")
                    } else { println("Saldo insuficiente \n==========================") }
                } else { println("Cantidad inválida \n==========================") }
            }
            4 -> { println("Nos vemos en la próxima \n==========================") }
            else -> { println("No has introducido una opción válida \n==========================") }
        }
    } while (option != 4)
}
