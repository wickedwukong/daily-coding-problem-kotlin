/*
This problem was asked by Amazon.

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
Given N, write a function that returns the number of unique ways you can climb the staircase.
The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X?
For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.

*/

package daily.coding.problem.day12

fun countUniqueWays(n: Int, stepSet: Set<Int> = setOf(1, 2)): Int {
    val results = (0..n).fold(Pair(0, mapOf<Int, Int>()), { acc, stairSteps ->

        val totalUniqueWays = stepSet.toList().sorted().fold(0, { total, steps ->
            when {
                stairSteps == steps -> total + 1
                steps == 1 -> acc.second[stairSteps - steps] ?: 0
                else -> total + (acc.second[stairSteps - steps] ?: 0)
            }
        })

        Pair(totalUniqueWays, acc.second.plus(Pair(stairSteps, totalUniqueWays)))
    })

    return results.first
}

