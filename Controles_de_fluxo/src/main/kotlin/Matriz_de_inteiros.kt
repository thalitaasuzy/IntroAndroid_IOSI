fun main() {
        val linhas = 3
        val colunas = 5
        val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }
        var digito = 1
            for (i in 0  until linhas) {
                for (j in 0 until colunas) {
                    print("${matriz[i][j]}")
                }
                println()
            }
            for(i in 0 until linhas){
                for(j in 0 until colunas){
                    matriz[i][j] = digito++
                }
            }
    println("Impressão da matriz: ")
    for (linha in matriz){
        for(valor in linha){
                print("${valor}")
        }
    println()
    }
    println("Quantidade de linhas da matriz: ${matriz.size}")
    println("Quantidade de colunas na matriz: ${matriz[0].size}")

}

