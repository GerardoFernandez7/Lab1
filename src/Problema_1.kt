fun main() {
    print("Ingrese un número entero: ")
    val decimal = readLine()?.toIntOrNull()

    if (decimal != null) {
        val binary = decimalToBinary(decimal)
        println("El número $decimal en binario es: $binary")
    } else {
        println("Entrada no válida. Por favor, ingrese un número entero.")
    }
}

fun decimalToBinary(n: Int): String {
    if (n == 0) return "0"

    var num = n
    val binary = StringBuilder()

    while (num > 0) {
        val remainder = num % 2
        binary.append(remainder)
        num /= 2
    }

    return binary.reverse().toString()
}