//7ª tarefa: Crie uma função que leia uma variável do tipo inteira, verifique
//se essa variável contém um número primo ou não.

fun main() {
    println(E_primo(3))
}

fun E_primo(num: Int): String {
    var primo: Boolean = true

    for (i in 2 until num) {
        if(num % i == 0) {
            primo = false
        }
    }

    if (primo) {
        return "É primo."
    } else {
        return "Não é primo"
    }
}