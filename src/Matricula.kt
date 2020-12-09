import java.text.SimpleDateFormat
import java.util.*

class Matricula(
    val aluno: Aluno,
    val curso: Curso

) {
     var data: String = ""
    //val formatador = SimpleDateFormat("dd/MM/yyyy")
 //   val dataMatricula = formatador.format(Date())

    constructor( aluno: Aluno, curso: Curso,data:String) : this(aluno, curso){
        this.data = data
    }




}