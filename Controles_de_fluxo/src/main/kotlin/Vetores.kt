fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0..(numeros.size - 1)){
        print("${numeros[i]} - ")
    }
    print("\n")
}

fun vetor_inteiros2(){
    var n = Array(10, {i->i})
    for (i in n){
        print("${n[i]} - ")
    }
    print("\n")
}

fun vetor_bool(){
    var a = booleanArrayOf(true, false, false, true)
    for (i in 0 .. (a.size - 1)) {
        print("${a[i]} -")
    }
    print("\n")
}

fun vetor_str(){
    var a = arrayOf("Fortaleza" , "Natal", "Recife")
    for (i in 0 .. (a.size - 1)) {
        print("${a[i]} - ")
    }
    print("\n")
}

fun vetor_floats(){
    var a = floatArrayOf(1.2f, 2.2f, 3.2f, 4.2f)
    for (i in 0 .. (a.size - 1)) {
        print("${a[i]} - ")
    }
    print("\n")
}

fun vetor_char(){
    var a = charArrayOf('A', 'E', 'I', 'O','U')
    for (i in 0 .. (a.size - 1)){
        print("${a[i]} - ")
    }
}

fun main() {
    vetor_inteiros()
    vetor_inteiros2()
    vetor_str()
    vetor_bool()
    vetor_floats()
    vetor_char()

}