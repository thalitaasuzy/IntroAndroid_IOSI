//3ª tarefa: Crie um programa que verifique se um número é primo (Estruturas de repetição)

fun main() {
    var num: Int = 29
    var primo: Boolean = true

    for (i in 2 until num) {
        if (num % i == 0) {
            primo = false
            break
        }
    }

    if (num <= 1) {
        println("Não é primo")
    }else if (primo) {
        println("Primo.")
    } else {
        println("Não é primo.")
    }

}