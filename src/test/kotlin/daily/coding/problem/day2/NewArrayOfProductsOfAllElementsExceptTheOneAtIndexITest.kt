package daily.coding.problem.day2

import kotlin.random.Random
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class NewArrayOfProductsOfAllElementsExceptTheOneAtIndexITest {


    @Test
    fun `should return an empty list for an empty list`() {
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(emptyList())).isEqualTo(emptyList<Int>())

        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(emptyList())).isEqualTo(emptyList<Int>())

    }

    @Test
    fun `should return an empty list for one element list`() {
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(anInteger()))).isEqualTo(emptyList<Int>())

        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(listOf(anInteger()))).isEqualTo(emptyList<Int>())
    }

    @Test
    fun `should return an empty list for two-element list`() {
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(anInteger(), anInteger()))).isEqualTo(emptyList<Int>())

        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(listOf(anInteger(), anInteger()))).isEqualTo(emptyList<Int>())
    }

    @Test
    fun `should work for 3 element list`() {
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(1, 2, 3))).isEqualTo(listOf(6, 3, 2))

        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(listOf(1, 2, 3))).isEqualTo(listOf(6, 3, 2))
    }

    @Test
    fun `return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i - for sample data`() {
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(1, 2, 3, 4, 5))).isEqualTo(listOf(120, 60, 40, 30, 24))
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIUsingDivision(listOf(3, 2, 1))).isEqualTo(listOf(2, 3, 6))

        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(listOf(1, 2, 3, 4, 5))).isEqualTo(listOf(120, 60, 40, 30, 24))
        assertThat(NewArrayOfProductsOfAllElementsExceptTheOneAtIndexIWithoutDivision(listOf(3, 2, 1))).isEqualTo(listOf(2, 3, 6))
    }


    private fun anInteger() = Random(System.currentTimeMillis()).nextInt()
}
