data class Step(val titulo: String) {
    private val lessons = mutableListOf<Lesson>()
    private var duracao: Int = 1

    fun addLesson(vararg lesson: Lesson) {
        lessons.addAll(lesson)
    }

    fun getLessons(): MutableList<Lesson> {
        return lessons
    }

    fun getduracao(): Int {
        lessons.forEach {
            duracao += it.duracao
        }
        return this.duracao
    }
}