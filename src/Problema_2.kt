fun main() {
    print("Ingrese varias palabras separadas por espacios: ")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        val words = input.split(" ")
        val palindromeCount = words.count { it.isPalindrome() }
        val twoDistinctVowelsCount = words.count { it.hasAtLeastTwoDistinctVowels() }
        val startsWithConsonantCount = words.count { it.startsWithConsonant() }

        println("Cantidad de palabras palíndromas: $palindromeCount")
        println("Cantidad de palabras con al menos 2 vocales distintas: $twoDistinctVowelsCount")
        println("Cantidad de palabras que inician con una consonante: $startsWithConsonantCount")
    } else {
        println("Entrada no válida. Por favor, ingrese una o más palabras separadas por espacios.")
    }
}

fun String.isPalindrome(): Boolean {
    val cleaned = this.lowercase().replace(Regex("[^a-z]"), "")
    return cleaned == cleaned.reversed()
}

fun String.hasAtLeastTwoDistinctVowels(): Boolean {
    val vowels = "aeiou"
    val distinctVowels = this.lowercase().filter { it in vowels }.toSet()
    return distinctVowels.size >= 2
}

fun String.startsWithConsonant(): Boolean {
    val consonants = "bcdfghjklmnpqrstvwxyz"
    return this.isNotEmpty() && this.lowercase().first() in consonants
}
