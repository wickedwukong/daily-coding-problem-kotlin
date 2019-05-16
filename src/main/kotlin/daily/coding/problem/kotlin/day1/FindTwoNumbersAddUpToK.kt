package daily.coding.problem.kotlin.day1

object FindTwoNumbersAddUpToK {
    operator fun invoke(numbers: List<Int>, k: Int): Boolean {
        val passedNumber = mutableListOf<Int>()

        return numbers.find { i ->
            if (!passedNumber.any { it + i == k }) {
                passedNumber.add(i)
                false
            } else {
                true
            }
        }?.let { true }?:false
    }
}