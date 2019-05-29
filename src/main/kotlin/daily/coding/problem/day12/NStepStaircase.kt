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

fun countUniqueWays(n: Int, steps: Set<Int> = setOf(1, 2)): Int {
    if (n == 0) return 0
//    if (n == 1) return 1
//    if (n == 2) return 2

    val results = (1..n).fold(Pair(0, mapOf<Int, Int>()), { acc, i ->

        val total = steps.toList().sorted().fold(acc.first, { total, j ->
            if (i == j) {
              total + 1
            } else {
                if (j != 1) {
                    total + (acc.second[i - j] ?: 0)
                } else {
                    total
                }
            }
        })

        Pair(total, acc.second.plus(Pair(i, total)))
    })

    return results.first
}

