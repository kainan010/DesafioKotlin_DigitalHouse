data class Curso(
    val nome: String,
    val cursoCod: Int,
    val professorTitular: ProfessorTitular,
    val professorAdjunto: ProfessorAdjunto,
    val qtdMaximaAlunos : Int,
    val listaAlunosMatriculados : ArrayList<Aluno>
) {





    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Curso
        if (cursoCod != other.cursoCod) return false

        return true
    }


}