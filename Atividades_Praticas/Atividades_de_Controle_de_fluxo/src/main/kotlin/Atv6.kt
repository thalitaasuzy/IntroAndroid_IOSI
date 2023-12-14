/* 6ª tarefa: Crie um programa que contenha funções chamando outras funções seguindo a ordem hierárquica de classificação dos números:

 Números reais contêm os números racionais, os racionais contêm os números inteiros,
 os números inteiros contêm os números naturais. (Uma função chamando a outra nessa
ordem).

 Imprima mensagens de sequenciamento para identificar e lhe dar a certeza que uma função chamou a outra com sucesso. */

fun main() {
    racionais()
}

fun racionais() {
    println("Passando pelos racionais...")
    inteiros()
}

fun inteiros(){
    println("Passando pelos inteiros... ")
    naturais()
}

fun naturais() {
    println("Passando pelos naturais.")
}