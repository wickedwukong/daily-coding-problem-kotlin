/**
Thursday 16/05/2019

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
*/

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
