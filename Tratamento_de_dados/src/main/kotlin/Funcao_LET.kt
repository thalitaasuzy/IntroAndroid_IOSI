fun main() {
    var str: String? = null
    str = "Wonka"
    if( str != null){
        println("Caiu no IF")
    }
    str?.let {
        println("Caiu na função LET")
    }
}

//Ambos apresentam a mesma funcionalidade lógica.