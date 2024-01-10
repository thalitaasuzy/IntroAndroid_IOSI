//Crie um algoritmo que converte horas em horas e minutos e
//minutos para horas e minutos. Atribua os valores a variáveis do tipo
//inteiras. 0,5 de hora = 30min

fun main() {
    convertMin(140)
    convertHoraseMin(0.5)

}
fun convertMin(min:Int){
    if (min > 60){
        var horas = min / 60
        var minutos: Int = min % 60

        if(minutos != 0){
            println("${horas}hrs e ${minutos}min")
        } else {
            println("${horas}hrs")
        }

    }
}

fun convertHoraseMin(total:Double){
    var horas = total.toInt()
    var min: Double = (total * 60) - (horas * 60)

    if( min != 0.0){
        println("${horas}hrs e ${min.toInt()}min")
    } else {
        println("${horas}hrs")
    }

}