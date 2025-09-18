package apuntes

fun main() {

    // LA ESTRUCTURA IF

    // La estructura if tiene una sintaxis y funcionamiento similar a otros lenguajes:

    val number = 10

    if (number >= 0) {
        // Código a ejecutar si el número es positivo
    }

    // LA ESTRUCTURA IF-ELSE

    var name = "Michel"

    if (name == "Michel") {
        // Código a ejecutar si name es Michel

    } else {
        // Código a ejecutar si name no es Michel
    }

    // ANIDAMIENTO

    if (number >= 0) {
        // Código a ejecutar si el número es positivo
    } else if (number > -10 && number <= -5) {
        // Código a ejecutar si el número está entre -5 y -9 (inclusive)
    } else {
        // Código a ejecutar en cualquier otro caso
    }

    // ESTRUCTURA WHEN

    // La estructura when equivale en cierto modo a la estructura switch de otros lenguajes

    val month = 3

    when (month) {
        1 -> {
            println("Enero")
        }

        2 -> {
            println("Febrero")
        }
        // ...
        else -> {
            println("Mes incorrecto")
        }
    }

    // Adicionalmente, en los diferentes casos internos se pueden hacer agrupaciones y rangos.
    // El siguiente when emite una respuesta si number vale 1 o 2, y otra si está entre 3 y 10:

    when (number) {
        1, 2 -> {
            println("Uno o dos")
        }

        in 3..10 -> {
            println("Entre 3 y 10")
        }

        is Int -> {
            println(number + 1)
        }

        !in 4..9 -> {
            println("No esta entre 4 y 9")
        }
    }

    // La expresión when no solo soporta números, sino que puede trabajar con textos y expresiones.

    println("Introduce tu fecha de nacimiento (formato dd/mm/aa): ")
    val fecha = readLine()

    if (fecha != null && Regex("""\d{2}/\d{2}/\d{2}""").matches(fecha)) {
        val dia = fecha.substring(0, 2).toInt()
        val mes = fecha.substring(3, 5).toInt()
        val anho = fecha.substring(6, 8).toInt()

        if (dia in 1..31 && mes in 1..12) {
            println("Fecha válida: $dia-$mes-$anho")
        } else {
            println("Fecha inválida: día o mes fuera de rango.")
        }
    } else {
        println("Formato incorrecto. Usa dd/mm/aa.")
    }
}