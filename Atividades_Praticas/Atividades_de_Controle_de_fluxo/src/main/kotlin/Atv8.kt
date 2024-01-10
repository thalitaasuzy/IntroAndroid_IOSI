//Crie uma função que imprima os 8 primeiros números da
//sequência de Fibonacci (inicie pelo número 1). Contemple a lógica dessa
//sequência no algoritmo. A sequência de Fibonacci é uma sequência numérica
//em que cada termo a partir do terceiro é a soma dos dois antecessores.


fun main() {
    fibonacci()
}

fun fibonacci(){
    var priTermo:Int = 1
    var segTermo:Int = 1
    var i = 0

    println(priTermo)
    println(segTermo)

    while (i<10) {
        var novoTermo = priTermo + segTermo
        println(novoTermo)
        i++
        priTermo = segTermo
        segTermo = novoTermo

    }
}