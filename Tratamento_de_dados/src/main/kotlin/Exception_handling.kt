import java.lang.ArithmeticException
import java.lang.IllegalArgumentException
import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 2
    try{
        val res = (numerador/denominador)
        println("Resultado: ${res}")
    }catch (e: ArithmeticException){
        println("Erro! Não existe divisão por 0.")
    }
    val numero = -3.0
    try {
        val res2 = sqrt(numero)
        if (numero < 0) {
            throw IllegalArgumentException()
        }
        println("Resultado: ${res2}")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz real de inteiros negativos.")
    }
}