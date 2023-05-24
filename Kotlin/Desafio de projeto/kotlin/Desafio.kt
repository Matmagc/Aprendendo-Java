fun Desafio() {
    println("iniciando teste de abstração!")

    val estruturasDeControlerDeFluxoEColecoesEmKotlin =
        EducationContent("Estruturas de Controler de Fluxo e coleções em Kotlin")

    val apresentacao = Step("Apresentação")

    apresentacao.addLesson(Lesson("Introdução e Objetivos", 6))

    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(apresentacao)

    val controleDeFluxo = Step("Controle de Fluxo")

    controleDeFluxo.addLesson(
        Lesson("Object Keyword", 7),
        Lesson("Sealed Classes", 7),
        Lesson("Enum Classes", 7),
        Lesson("Data Classes", 7),
        Lesson("Inheritance", 6),
        Lesson("Generics", 7),
        Lesson("Classes", 6),
        Lesson("Null Safety", 5),
        Lesson("Variables", 4),
        Lesson("Functions", 5),
        Lesson("Hello World", 3)
    )

    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(controleDeFluxo)

    val colecoes = Step("Coleções")

    colecoes.addLesson(
        Lesson("Listas (List)", 11),
        Lesson("Conjuntos (Set)", 7),
        Lesson("Mapas (Map)", 8),
        Lesson("Funções Úteis", 9)
    )

    val materialDeApoio = Step("Materias de Apoio e Questionário")
    materialDeApoio.addLesson(
        Lesson("Materias de Apoio e Questionário e Conclusão", 4)
    )

    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(materialDeApoio)

    println("Dados do conteúdo educacional (Estruturas de Controler de Fluxo e Coleções em Kotlin)")
    println(estruturasDeControlerDeFluxoEColecoesEmKotlin.getSteps())

    val bootcampTQIKotlinBackendDeveloper = Treinamento("Bootcamp TQI Kotlin - Backend Developer")
    bootcampTQIKotlinBackendDeveloper.addContent(estruturasDeControlerDeFluxoEColecoesEmKotlin)

    println("Dados da minha formação (Bootcamp TQI Kotlin - Backend Developer)")
    println("Formação: " + bootcampTQIKotlinBackendDeveloper.nome + " - Duração: " + bootcampTQIKotlinBackendDeveloper.getduracao())

    val Maria = User("Maria", "Maria@gmail.com")
    val Jose = User("José", "José@gmail.com")
    val Mario = User("Mario", "Mario@gmail.com")

    bootcampTQIKotlinBackendDeveloper.register(Maria)
    bootcampTQIKotlinBackendDeveloper.register(Jose)
    bootcampTQIKotlinBackendDeveloper.register(Mario)

    println("Alunos da formação: " + bootcampTQIKotlinBackendDeveloper.nome)
    println("Alunos: " + bootcampTQIKotlinBackendDeveloper.getSubscribed())

}
