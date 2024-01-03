import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun main() {
    ler_arquivo()

}

fun ler_arquivo(){
    val arquivo = File("C:\\Users\\Windows\\Desktop\\CursoIntroAndroid_IOSI-main\\Tratamento_de_dados\\src\\main\\kotlin\\Instructions.txt")
    try {
        Scanner(arquivo).use{l ->
            while (l.hasNext()){
                println(l.next())
            }
            l.close()
        }
    }catch (e: FileNotFoundException){
        println("Falha ao ler o arquivo.")
        //e.printStackTrace();
    }
}