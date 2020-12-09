open class Professor(
   val nome: String,
   val sobrenome: String,
   val tempoDeCasa: Int,
   val professorCod: Int
) {










    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Professor

        if (professorCod != other.professorCod) return false

        return true
    }

    override fun toString(): String {
        return "Professor(nome='$nome', sobrenome='$sobrenome', professorCod=$professorCod) "
    }

}