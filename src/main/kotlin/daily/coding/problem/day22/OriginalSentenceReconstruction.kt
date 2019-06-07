package daily.coding.problem.day22

object OriginalSentenceReconstruction {
    operator fun invoke(sentence: String, dictionary: List<String>): List<String> {
        if (sentence.isBlank() || sentence.isEmpty()) return emptyList()

        if (dictionary.contains(sentence)) return listOf(sentence)

        return emptyList()
    }
}
