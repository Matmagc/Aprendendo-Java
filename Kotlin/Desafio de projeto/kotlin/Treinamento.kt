data class Treinamento(val nome: String) {
    private var duracao = 0
    private val subscribed = mutableListOf<User>()
    private val content = mutableListOf<EducationContent>()

    fun register(user: User) {
        subscribed.add(user)
    }

    fun getSubscribed(): MutableList<User> {
        return this.subscribed
    }

    fun addContent(educationContent: EducationContent) {
        content.add(educationContent)
        duracao += educationContent.getduracao()
    }

    fun getduracao(): Int {
        return this.duracao
    }
}