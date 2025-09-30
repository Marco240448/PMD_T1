package ejercicios
fun main() { val ip = "192.168.1.1"
    println(classifyIP(ip)) }
fun classifyIP(ip: String): String { val octets = ip.split(".")
    if (octets.size != 4) return "IP inválida: debe tener 4 octetos."
    val nums = octets.mapNotNull { it.toIntOrNull()?.takeIf { n -> n in 0..255 }
    }
    if (nums.size != 4) return "IP inválida: cada octeto debe estar entre 0 y 255."
    val (a, b) = nums
    return when {
        a == 10 -> "IP Privada (Clase A)"
        a == 172 && b in 16..31 -> "IP Privada (Clase B)"
        a == 192 && b == 168 -> "IP Privada (Clase C)"
        a == 127 -> "IP de loopback (localhost)"
        a in 1..223 -> "IP Pública (Clase A/B/C)"
        a in 224..239 -> "IP Multicast"
        else -> "IP Especial o Reservada"
    }
}
