fun main() {
    var cargo: String = "Gerente"

    when(cargo) {
        "Presidente" -> println(6000)
        "Gerente" -> println(4500)
        "Coordenador" -> println(3000)
        "Analista" -> println(2400)
        "Estagiário" -> println(1600)
        else -> println("Cargo não identificado")
    }

    var imc:Float = 30f

    when(imc) {
        10f -> println("IMC está 10 ou abaixo")
        20f -> println("IMC está 20 ou maior que 11")
        30f -> println("IMC está 30 ou maior que 21")
        40f -> println("IMC está 40 ou maior que 31")
        else -> println("IMC está acima do normal")
    }
}

// "->" significa está associado