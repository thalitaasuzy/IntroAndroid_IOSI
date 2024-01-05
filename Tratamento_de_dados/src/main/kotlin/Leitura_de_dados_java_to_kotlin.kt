import java.util.Scanner

fun lerInt(){
    val scanner = Scanner(System.`in`)
    println("Digite um número inteiro: ")
    val num = scanner.nextInt()
    println("Você digitou: ${num}")
}

fun lerDouble(){
    val scanner = Scanner(System.`in`)
    println("Digite um número racional: ")
    val num = scanner.nextDouble()
    println("Você digitou: ${num}")
}

fun lerStr(){
    val scanner = Scanner(System.`in`)
    println("Digite um nome: ")
    val num = scanner.next()
    println("Você digitou: ${num}")
}

fun main() {
    lerInt()
    lerDouble()
    lerStr()
}
