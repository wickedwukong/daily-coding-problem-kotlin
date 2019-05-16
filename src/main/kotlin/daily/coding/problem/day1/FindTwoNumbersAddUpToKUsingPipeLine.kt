package daily.coding.problem.day1

object FindTwoNumbersAddUpToKUsingPipeLine {
    operator fun invoke(numbers: List<Int>, k: Int): Boolean {
        val passedNumber = mutableListOf<Int>()

        return numbers.find { i ->
            if (!passedNumber.any { it + i == k }) {
                passedNumber.add(i)
                false
            } else {
                true
            }
        }?.let { true } ?: false
    }
}

object FindTwoNumbersAddUpToKUsingForLoop {
    operator fun invoke(numbers: List<Int>, k: Int): Boolean {
        for ((index, i) in numbers.withIndex()) {
            if (numbers.subList(index + 1, numbers.size).any{it + i == k}) return true
        }
        return false
    }
}