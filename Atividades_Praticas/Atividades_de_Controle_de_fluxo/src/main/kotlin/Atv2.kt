/*
2ª tarefa: Crie um programa que retorne a situação de um aluno, baseado em uma função que calcula a média de 4 notas (parâmetros)
e verifique se essa média está:

Se uma nota for digitada acima de 10 ou menor que 0, imprima uma mensagem de erro (“Nota inexistente”) ao usuário e pare a execução do programa.
Aprovado: Maior ou igual a 7,0.
Recuperação: Maior ou igual a 4 e menor que 7.
Reprovado: Menor que 4.
*/

fun main() {


    var nota1: Float = 10f
    var nota2: Float = 12f
    var nota3: Float = 8f
    var nota4: Float = 8f

    print(calcMedia(nota1, nota2, nota3, nota4))

}




fun calcMedia(n1: Float, n2: Float, n3: Float, n4: Float): String {

    var notas = floatArrayOf(n1, n2, n3, n4)
    for (nota in notas) {
        if (nota < 0 || nota > 10) {
            return ("Nota inexistente.")
        }
    }

    var media = (n1 + n2 + n3 + n4) / 4

    if (media >= 7) {
        return "Aprovado. Sua média é: ${media}"
    } else if (media >= 4 && media < 7) {
        return "Recuperação. Sua média é: ${media}"
    } else {
        return "Reprovado. Sua média é: ${media}"
    }
}