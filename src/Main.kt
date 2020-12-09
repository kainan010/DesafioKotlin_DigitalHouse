fun main(){
    println()

    println("------DESAFIO KOTLIN _ DIGITAL HOUSE -------")

    println()

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

    manager.matricularAluno("Vitor", " oliveira", 1)
    manager.matricularAluno("Caio", "Crevelaro", 2)
    manager.matricularAluno("Kainan", "Andrade", 3)
    manager.matricularAluno("Celia", "Celly", 4)
    manager.matricularAluno("Lais", "Rolim", 5)

    manager.registrarProfessorTitular("Kaio", "Andrade", 1,  "Android")
    manager.registrarProfessorTitular("Matheus", "Henrique", 2,  "Flutter")

    manager.registrarProfessorAdjunto("Joao", "Matheus", 3, 12)
    manager.registrarProfessorAdjunto("Jose", "marcos", 4, 11)

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