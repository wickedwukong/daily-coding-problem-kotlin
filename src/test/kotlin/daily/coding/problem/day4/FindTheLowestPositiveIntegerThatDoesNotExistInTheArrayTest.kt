package daily.coding.problem.day4
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class FindTheLowestPositiveIntegerThatDoesNotExistInTheArrayTest {

    @Test
    fun `should return 1 for empty list`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(emptyList())).isEqualTo(1)
    }

    @Test
    fun `should return 1 for list has no positive values`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(-1))).isEqualTo(1)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(0))).isEqualTo(1)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(0, 0, -10, 0, -99))).isEqualTo(1)
    }

    @Test
    fun `should give 1 as the lowest int for a list which has 2 at its lowest positive int`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(2))).isEqualTo(1)
    }

    @Test
    fun `should give 2 as the lowest int for a list which has 1 at its lowest positive int`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(1))).isEqualTo(2)
    }

    @Test
    fun `should give 2 for the sample data - 1`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(3, 4, -1, 1))).isEqualTo(2)
    }

    @Test
    fun `should give 2 for the sample data - 2`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(1, 2, 0))).isEqualTo(3)
    }

    @Test
    fun `should work for more complex cases`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(1, 2, 6, 7))).isEqualTo(3)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(1, 2, 3, 7))).isEqualTo(4)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(1, 2, 3, 4, 5, 6, 7))).isEqualTo(8)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(2, 3, 4, 5, 6, 7))).isEqualTo(1)
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(listOf(2, 3, 4, 7))).isEqualTo(1)
    }

}
