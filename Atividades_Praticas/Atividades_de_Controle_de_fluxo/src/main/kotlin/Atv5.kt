/* 5ª tarefa: Crie uma matriz 4x4 do tipo Float, imprima as seguintes informações:
* Quantidade de colunas, através de comandos da matriz;
* Quantidade de linhas, através de comandos da matriz;
* Os elementos que compõe a matriz.
* */

fun main() {
    val linhas: Int = 4
    val colunas: Int = 4
    val matriz: Array<Array<Float>> = Array(linhas) {Array(colunas) {0f} }

    var digito: Float = 1.2f

    for(i in 0 until linhas){
        for(j in 0 until colunas ) {
            matriz[i][j] = digito++
        }
    }

    println("Impressão da matriz: ")
    for (linha in matriz){
        for(valor in linha){
            print("${valor}  ")
        }
        println()
    }
    println("Quantidade de linhas da matriz: ${matriz.size}")
    println("Quantidade de colunas na matriz: ${matriz[0].size}")

}