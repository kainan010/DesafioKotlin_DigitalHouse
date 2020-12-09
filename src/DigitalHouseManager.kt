class DigitalHouseManager {

    private  val listaAlunos = mutableListOf<Aluno>()
    private  val listaProfessores = mutableListOf<Professor>()
    private  val listaCursos = mutableListOf<Curso>()
    private  val listaMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int,quantidadeMaximaDeAlunos: Int ){
        listaCursos.add(Curso(nome,codigoCurso,quantidadeMaximaDeAlunos ))
    }

    fun excluirCurso(codigoCurso: Int) = listaCursos.removeIf { it.cursoCod == codigoCurso }


    fun registrarProfessorAdjunto(nome: String , sobrenome: String ,codigoProfessor: Int, quantidadeDeHoras: Int){
        listaProfessores.add(ProfessorAdjunto(nome,sobrenome,codigoProfessor,quantidadeDeHoras ))
    }

    fun registrarProfessorTitular(nome: String , sobrenome: String, codigoProfessor: Int, especialidade: String){
        listaProfessores.add(ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade))
    }

    fun excluirProfessor(codigoProfessor: Int) = listaProfessores.removeIf{ it.professorCod == codigoProfessor }

   fun  matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
       listaAlunos.add(Aluno(nome = nome,sobrenome = sobrenome , alunoCod =  codigoAluno))
   }

    fun matricularAluno(codigoAluno : Int, codigoCurso: Int){

       var cursoMatriculando =  listaCursos.find { it.cursoCod == codigoCurso }
        var alunoMatricular = listaAlunos.find { it.alunoCod == codigoAluno }

        if(cursoMatriculando != null  && alunoMatricular != null ){
            if(cursoMatriculando.adicionarUmAluno(alunoMatricular)){
                listaMatriculas.add(Matricula(alunoMatricular,cursoMatriculando))
                println("Matricula realizada com sucesso ")
            }else{
                println("Erro ao realizar a Matricula porque não há vagas ")
            }
        }


    }


    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        var cursoEncontrado = listaCursos.find { it.cursoCod == codigoCurso }
        var professorTitularEncontrado =  listaProfessores.find { it.professorCod== codigoProfessorTitular }
        var professorAdjuntoEncontrado = listaProfessores.find { it.professorCod == codigoProfessorAdjunto}


            if (cursoEncontrado != null) {
                if (professorTitularEncontrado != null && professorAdjuntoEncontrado != null) {
                    listaProfessores.add(professorTitularEncontrado )
                    listaProfessores.add(professorAdjuntoEncontrado)
                }
            }

    }




}