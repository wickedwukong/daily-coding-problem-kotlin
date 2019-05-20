package daily.coding.problem.day2

/*
Friday 17/05/2019

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/

object NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision {
    operator fun invoke(values: List<Int>): List<Int> {
        if (values.size <= 2) return emptyList()

        return values.map { totalProduct(values) / it }
    }

    private fun totalProduct(values: List<Int>) = values.reduce { acc, i -> acc * i }
}

object NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision {
    operator fun invoke(values: List<Int>): List<Int> {
        if (values.size <= 2) return emptyList()

        return values.withIndex().map { (index, _) ->
                val productOfElementsBeforeIndex = values.subList(0, index).fold(1, {acc, i -> acc * i })
                val productOfElementsAfterIndex = values.subList(index + 1, values.size).fold(1, {acc, i -> acc * i })

            productOfElementsBeforeIndex * productOfElementsAfterIndex
        }
    }
}
