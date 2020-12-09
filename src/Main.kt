fun main(){
    println("DESAFIO KOTLIN _ DIGITAL HOUSE")

   // val teste = Matricula("18/09/2020")

    // objetos Professores Titulares
//    val professorTitular1 = ProfessorTitular(
//        nome = "Kaio",
//        sobrenome = "Andrade",
//        professorCod = 1212,
//        especialidade = "Android"
//    )
//    val professorTitular2 = ProfessorTitular(
//        nome = "Matheus",
//        sobrenome = "Henrique",
//        professorCod = 1213,
//        especialidade = "Flutter")

    // objetos Professores Adjuntos
//    val professorAdjunto1 = ProfessorAdjunto(
//        nome = "Joao",
//        sobrenome = " Matheus",
//        professorCod = 1112,
//        qtdHorasMonitoria = 14)
//    val professorAdjunto2 = ProfessorAdjunto(
//        nome = "Jose",
//        sobrenome = "marcos",
//        professorCod = 1112,
//        qtdHorasMonitoria = 13)


    val manager = DigitalHouseManager()

    manager.matricularAluno("William", "Lucas", 1)
    manager.matricularAluno("Marcelo", "Leandro", 2)
    manager.matricularAluno("Elias", "Maluco", 3)
    manager.matricularAluno("Andre", "do Rap", 4)
    manager.matricularAluno("Jorge", "Aragao", 5)

    manager.registrarProfessorTitular("Silas", "Rodrigo", 1,  "Cálculo")
    manager.registrarProfessorTitular("José", "Fernando", 2,  "Java")

    manager.registrarProfessorAdjunto("Jorge", "Marcelo", 3, 12)
    manager.registrarProfessorAdjunto("Juliano", "Rafael", 4, 11)

    manager.registrarCurso("Full stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.alocarProfessores(20001, 1, 3)
    manager.alocarProfessores(20002, 2, 4)

    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)
    manager.matricularAluno(3, 20002)
    manager.matricularAluno(4, 20002)
    manager.matricularAluno(5, 20002)



}