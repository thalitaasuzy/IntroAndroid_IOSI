// Crie um programa que lê um vetor de Double de 10 elementos
//e pesquisa um número dentro desse vetor. Retorne “Elemento x achado”
//caso pertença ao vetor ou “Elemento x não achado” caso não pertença ao vetor.

fun main() {
    val lista: DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)
    searchOnList(2.5, lista)

}

fun searchOnList(elemento:Double, vetor: DoubleArray){
    var encontrado: Boolean = false

    for (i in vetor) {
        if (elemento == i) {
            encontrado = true

        }
    }
    if (encontrado) {
        println("Elemento ${elemento} encontrado")
    } else {
        println("Elemento ${elemento} não encontrado.")
    }
}