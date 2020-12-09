class ProfessorAdjunto(var qtdHorasMonitoria : Int, nome: String, sobrenome: String, tempoDeCasa: Int,professorCod : Int) : Professor(
    nome = nome,
    sobrenome = sobrenome,
    tempoDeCasa = tempoDeCasa,
    professorCod = professorCod)
{
    constructor(nome: String,sobrenome: String,professorCod: Int,qtdHorasMonitoria: Int, tempoDeCasa: Int = 0) : this(qtdHorasMonitoria, nome, sobrenome, tempoDeCasa, professorCod){
//        this.nome = nome
//        this.sobrenome = sobrenome
//        this.professorCod = professorCod
//        this.qtdHorasMonitoria = qtdHorasMonitoria
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', professorCod=$professorCod) , quantidadeHoras=$qtdHorasMonitoria "
    }



}