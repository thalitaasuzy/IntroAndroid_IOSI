fun main() {
    var str: String? = null
    println(str?.length) //Kotlin Identifica e assume o tratamento do erro
    str = "Testando string"
    println(str!!.length) //Eu assumo o erro
    println("Testando...")
}