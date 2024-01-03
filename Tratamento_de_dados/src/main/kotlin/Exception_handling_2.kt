import kotlin.math.sqrt

fun main() {
    try {
        var s: String? = null
        try {
            println("O tamanho da String é: ${s!!.length} ")
        } catch (e: NullPointerException) {
            println("A variável está vazia.")
        }

        try {
            var a: Int = 10 / 0
            println("O resultado da divisão será: $a")
        } catch (e: ArithmeticException) {
            println("Não existe divisão por 0.")
        }

        try {
            var b = -9.0
            if (b < 0) {
                throw IllegalArgumentException()
            }
            var c: Double = sqrt(b)
        } catch (e: IllegalArgumentException) {
            println("Não existe raiz de número negativo, sendo exclusivo para o conjunto dos números complexos.")
        }

        try {
            var x = 1
            if (x == 1) {
                throw Exception("O valor de X não pode ser 1.")
            }
        } catch (e: Exception) {
            print("Exceção mais geral: ")
            println(e.message)
        }
    } finally {
        println("Executando >Finally<, finalizando o bloco de tratamento de dados.")
    }
    println("Final do Programa!")
}
