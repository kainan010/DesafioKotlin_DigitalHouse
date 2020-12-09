data class Curso(
    var nome: String,
    var cursoCod: Int,
    var qtdMaximaAlunos : Int

) {
    val professorTitular: ProfessorTitular? = null
    val professorAdjunto: ProfessorAdjunto? = null

    val listaAlunosMatriculados = mutableListOf<Aluno>()

//    constructor(nome: String,cursoCod: Int,qtdMaximaAlunos: Int){
//        this.nome = nome
//        this.cursoCod = cursoCod
//         this.qtdMaximaAlunos = qtdMaximaAlunos
  //  }

   // constructor(cursoCod: Int)

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(listaAlunosMatriculados.size < qtdMaximaAlunos){
            listaAlunosMatriculados.add(umAluno)
            return true
        }

        return false
    }
     fun excluirAluno(umAluno: Aluno){
         listaAlunosMatriculados.remove(umAluno)
     }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso
        if (cursoCod != other.cursoCod) return false

        return true
    }

    override fun toString(): String {
        return "Curso(nome='$nome', cursoCod=$cursoCod, qtdMaximaAlunos=$qtdMaximaAlunos)"
    }


}