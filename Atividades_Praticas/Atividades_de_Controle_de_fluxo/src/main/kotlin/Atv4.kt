//4ª tarefa: Crie um programa que armazene um vetor de 10 nomes de pessoas e as imprima
// conforme foram indexadas.

fun main() {
    var nomes = arrayListOf<String>("Ana", "Bia", "Paulo", "Alexa", "João", "Mari", "Clara", "Gabriel", "Samuel", "Lana" )

    for (nome in nomes){
        println("${nomes.indexOf(nome)} - ${nome}")
    }
}