package ejercicios

/* Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado. */

fun main() {
    CalcularBisisetos30(1980)
    CalcularBisisetos30(1880)
}

fun CalcularBisisetos30(year: Int) {
    var YearActual : Int = year + 1
    for (index in 1..30) {
        if (YearActual % 4 == 0 && (YearActual % 100 != 0 || YearActual % 400 == 0)) {
            println("$YearActual")
        }
        YearActual += 1
    }
}