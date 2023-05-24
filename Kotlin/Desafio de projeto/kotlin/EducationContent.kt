data class EducationContent(val titulo: String) {
    private val steps = mutableListOf<Step>()
    private var duracao: Int = 0

    fun addStep(step: Step) {
        steps.add(step)
        duracao += step.getduracao()
    }

    fun getSteps(): MutableList<Step> {
        return steps
    }

    fun getduracao(): Int {
        return this.duracao
    }
}