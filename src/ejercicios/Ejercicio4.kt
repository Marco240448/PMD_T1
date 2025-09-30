package ejercicios

/* Crea una función que imprima los 30 próximos años bisiestos siguientes a uno dado. */

fun main() {
    calcularBisisetos30(1980)
    calcularBisisetos30(1880)
}
fun calcularBisisetos30(year: Int) {
    var yearActual : Int = year + 1
    for (index in 1..30) {
        if (yearActual % 4 == 0 && (yearActual % 100 != 0 || yearActual % 400 == 0)) { println(yearActual) }
        yearActual += 1
    }
}