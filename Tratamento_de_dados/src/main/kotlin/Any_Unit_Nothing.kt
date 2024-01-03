fun main() {
    a(10f)
    b()
    c()

}

fun a(valor: Any){
    println("Imprimindo o valor: ${valor}")
    println("A função a() recebe um parâmetro de tipo Any, que é um tipo genérico capaz de aceitar qualquer tipo de valor. Ela imprime o valor recebido.")
}

fun b():Unit{
    println("Funçãon sem retorno (VOID)")
    println("A função b() não possui um tipo de retorno explícito (indicado por Unit), o que é semelhante ao conceito de void em algumas outras linguagens. Ela simplesmente imprime uma mensagem.")
}

fun c():Nothing{
     TODO ("Função ainda a ser completada. A função c() tem um tipo de retorno explícito Nothing, indicando que essa função nunca retorna normalmente. Nesse caso, usamos a função TODO para sinalizar que a implementação ainda está pendente.")
}