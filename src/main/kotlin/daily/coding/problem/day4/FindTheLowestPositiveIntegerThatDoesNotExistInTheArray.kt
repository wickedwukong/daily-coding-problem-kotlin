/*
19/05/2019
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/

package daily.coding.problem.day4

object FindTheLowestPositiveIntegerThatDoesNotExistInTheArray {
    operator fun invoke(valueList: List<Int>): Int {
        if (valueList.none { it > 0 }) return 1

        fun lowestPositive() = valueList.filter { it > 0 }.sorted().first()
        fun highestPositive() = valueList.filter { it > 0 }.sorted().last()


        return ((lowestPositive() - 1)..(highestPositive() + 1)).filter { !valueList.contains(it) }.first { it > 0 }
    }
}
