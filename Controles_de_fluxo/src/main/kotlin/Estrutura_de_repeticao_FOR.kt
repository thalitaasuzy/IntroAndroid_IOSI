fun main() {
    for(i in 1 .. 20) { //Estrutura de Repetição for Crescente de 1 em 1
        print("${i}")
    }
    print("\n") //Quebra de linha
    for (i in 20 downTo 1){
        print("${i}")
    }
    print("\n") //Quebra de linha
    val str = "Criação de Aplicativos Android"
    for(i in str){
        print("${i} ")
    }

    print("\n")
    for (i in 0 .. 20 step 2){ //Estrutura de Repetição for Crescente de 2 em 2
        print("${i}")
    }

    print("\n")
    for (i in 1 .. 20 step 3){ //Estrutura de Repetição for Crescente de 3 em 3
        print("${i}")
    }
}