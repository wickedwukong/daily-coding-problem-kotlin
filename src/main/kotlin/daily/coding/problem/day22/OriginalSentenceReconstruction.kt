package daily.coding.problem.day22

object OriginalSentenceReconstruction {
    operator fun invoke(sentence: String, dictionary: List<String>): List<String> {
        if (sentence.isBlank() || sentence.isEmpty()) return emptyList()
        if (dictionary.contains(sentence)) return listOf(sentence)

        return reconstruct(sentence, dictionary)
    }

    private fun reconstruct(sentence: String, dictionary: List<String>): List<String> {
        if (sentence.isEmpty()) return emptyList()

        return sentence.fold(Pair("", emptyList<String>()), { acc, char ->
            val currentAttemptedWord = acc.first + char
            if (dictionary.contains(currentAttemptedWord)) {
                val reconstruction = acc.second.plus(currentAttemptedWord) + reconstruct(sentence.substring(currentAttemptedWord.length), dictionary)
                Pair(currentAttemptedWord, reconstruction)

            } else {
                Pair(currentAttemptedWord, acc.second)
            }
        }).second
    }


}
