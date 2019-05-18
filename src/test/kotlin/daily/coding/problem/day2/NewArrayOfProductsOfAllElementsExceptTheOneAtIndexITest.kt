package daily.coding.problem.day2

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.Ignore
import kotlin.test.assertEquals

class NewArrayOfProductsOfAllElementsExceptTheOneAtIndexITest {

    @Test
    fun `return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i - for sample data`() {
        assertEquals(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(1, 2, 3, 4, 5)), listOf(120, 60, 40, 30, 24))
        assertEquals(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(3, 2, 1)), listOf(2, 3, 6))
    }

    @Test
    fun `should return an empty list for an empty list`() {
        assertEquals(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(emptyList()), emptyList())
    }

    @Test
    fun `should return an empty list for one element list`() {
        assertEquals(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(anInteger())), emptyList())
    }

    private fun anInteger() = Random(System.currentTimeMillis()).nextInt()
}
