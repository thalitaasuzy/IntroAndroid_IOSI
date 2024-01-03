
fun impressao() { //Função sem parâmetro e sem retorno (void)
    println("Função sem parâmetro e sem retorno")
}

fun soma(a: Int,b: Int): Int { //Função com parâmetro e com retorno do tipo inteiro
    return a + b
}

fun soma_2(a:Int, b: Int) { //Função com parâmetro e sem retorno
    println("A soma das variáveis é: ${a+b}")

}

fun main() { //Executa o código
    impressao()

    var x = 2
    var y = 1
    println(soma(x,y))

    soma_2(x,y)
}

