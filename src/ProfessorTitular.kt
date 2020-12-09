class ProfessorTitular(
    val especialidade: String,
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    professorCod: Int
) : Professor(
    nome,
    sobrenome,
    tempoDeCasa,
    professorCod
) {

    constructor( nome: String,sobrenome: String,professorCod: Int,especialidade: String, tempoDeCasa: Int = 0):this(especialidade, nome, sobrenome, tempoDeCasa, professorCod)


    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', professorCod=$professorCod) , especialidade=$especialidade "
    }
}