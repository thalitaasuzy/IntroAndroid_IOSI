fun main() {
    //Classifique as pessoas através da faixa etária:
    //Idoso - 60 anos acima / Adulto - 21 a 59 anos / Jovem - 13 e 20 anos / Criança - 12 anos abaixo

    var idade: Int = 4

    if (idade<=12) {
        println("Criança")
    } else if (13 <= idade && idade <= 20) {
        println("Jovem")
    } else if (21 <= idade && idade <= 59 ) {
        println("Adulto")
    } else {
        println("Idoso")
    }
}