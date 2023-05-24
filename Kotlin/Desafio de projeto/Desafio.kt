
class Desafio

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class User(var nome: String, var email: String)

data class Lesson(val titulo: String, val duracao: Int)

data class EducationContent (val titulo: String){
    val steps = mutableListOf<Step>()
    var duracao: Int = 0

    fun addStep(step: Step){
        steps.add(step)
        duracao += step.getduracao()
    }

    fun getSteps(): MutableList<Step> {
        return steps
    }

    fun getduracao(): Int{
        return this.duracao
    }

    data class Step(val titulo: String){
        val lessons = mutableListOf<Lesson>()
        var duracao: Int = 1

        fun addLesson(vararg lesson: Lesson){
            lessons.addAll(lesson)
        }

        fun getLessons(): MutableList<Lesson>{
            return lessons
        }

        fun getduracao(): Int{
            lessons.forEach{
                duracao += it.duracao
            }
            return this.duracao
        }
    }
    data class Treinamento(val nome: String){
        var duracao = 0
        val subscribed = mutableListOf<User>()
        val content = mutableListOf<EducationContent>()

        fun register(user: User){
            subscribed.add(user)
        }

        fun getSubscribed(): MutableList<User>{
            return this.subscribed
        }

        fun addContent(educationContent: EducationContent){
            content.add(educationContent)
            duracao += educationContent.getduracao()
        }

        fun getduracao(): Int{
            return this.duracao
        }
    }
}
fun main() {
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
    println("Formação: " + bootcampTQIKotlinBackendDeveloper.name + " - Duração: " + bootcampTQIKotlinBackendDeveloper.getDuration())

    val Maria = User("Maria", "Maria@gmail.com")
    val José = User("José", "José@gmail.com")
    val Mario = User("Mario", "Mario@gmail.com")

    bootcampTQIKotlinBackendDeveloper.register(Maria)
    bootcampTQIKotlinBackendDeveloper.register(José)
    bootcampTQIKotlinBackendDeveloper.register(Mario)

    println("Alunos da formação: " + bootcampTQIKotlinBackendDeveloper.name)
    println("Alunos: " + bootcampTQIKotlinBackendDeveloper.getSubscribed())

}
