fun main() {
    var str: String? = null
    str = "Anne with an E"

//    if (str == null){
//        println("Variável Nula.")
//    }else{
//        println(str)
//    }

    // Operador Elvis
    println(str ?: "nula")
}