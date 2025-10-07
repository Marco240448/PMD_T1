package ejercicios
/*
* Enunciado:
* Escribe un programa en Kotlin que gestione una lista de contactos.
* El programa debe permitir al usuario realizar las siguientes operaciones:
*   Agregar un nuevo contacto con un nombre y un número de teléfono.
*   Buscar un contacto por nombre y mostrar su número de teléfono.
*   Actualizar el número de teléfono de un contacto existente.
*   Eliminar un contacto por nombre.
*   Listar todos los contactos almacenados en la lista.
*   Salir de la aplicación.
* El programa debe utilizar un mapa (diccionario) para almacenar los contactos,
* donde el nombre del contacto es la clave y el número de teléfono es el valor.
* Debes proporcionar un menú interactivo que permita al usuario seleccionar las operaciones mencionadas anteriormente.
*/
fun main() {
    val contactos = mutableMapOf<String, String>()
    do {
        println("===================================")
        println("1) Agregar contacto \n2) Buscar contacto \n3) Actualizar contacto \n4) Eliminar contacto \n5) Listar contactos \n6) Salir")
        print("Selecciona una opción: ")
        val option = readlnOrNull()?.toIntOrNull()
        println("===================================")
        when (option) {
            1 -> nuevoContacto(contactos)
            2 -> buscarContacto(contactos)
            3 -> actualizarContacto(contactos)
            4 -> eliminarContacto(contactos)
            5 -> listaContactos(contactos)
            6 -> println("Hasta la próxima")
            else -> println("Opción no válida. Inténtalo de nuevo.")
        }
    } while (option != 6)
}
fun esNumeroValido(numero: String): Boolean {
    val regex = Regex("^\\d{9}$")
    return regex.matches(numero)
}
fun nuevoContacto(contactos: MutableMap<String, String>) {
    print("Nombre del contacto: ")
    val nombre = readln()
    var numero: String
    do {
        print("Número de teléfono (9 dígitos): ")
        numero = readln()
        if (!esNumeroValido(numero)) {
            println("Número inválido. Intenta nuevamente.")
        }
    } while (!esNumeroValido(numero))
    contactos[nombre] = numero
    println("Contacto agregado.")
}
fun buscarContacto(contactos: Map<String, String>) {
    print("Nombre del contacto a buscar: ")
    val nombre = readln()
    val numero = contactos[nombre]
    if (numero != null) {
        println("Número de teléfono de $nombre: $numero")
    } else {
        println("Contacto no encontrado.")
    }
}
fun actualizarContacto(contactos: MutableMap<String, String>) {
    print("Nombre del contacto a actualizar: ")
    val nombre = readln()
    if (nombre in contactos) {
        var numero: String
        do {
            print("Nuevo número de teléfono (10 dígitos): ")
            numero = readln()
            if (!esNumeroValido(numero)) {
                println("Número inválido. Intenta nuevamente.")
            }
        } while (!esNumeroValido(numero))
        contactos[nombre] = numero
        println("Contacto actualizado.")
    } else {
        println("Contacto no encontrado.")
    }
}
fun eliminarContacto(contactos: MutableMap<String, String>) {
    print("Nombre del contacto a eliminar: ")
    val nombre = readln()
    if (contactos.remove(nombre) != null) {
        println("Contacto eliminado.")
    } else {
        println("Contacto no encontrado.")
    }
}
fun listaContactos(contactos: Map<String, String>) {
    if (contactos.isEmpty()) {
        println("No hay contactos en la lista.")
    } else {
        println("Lista de contactos:")
        for ((nombre, numero) in contactos) {
            println("$nombre: $numero")
        }
    }
}
