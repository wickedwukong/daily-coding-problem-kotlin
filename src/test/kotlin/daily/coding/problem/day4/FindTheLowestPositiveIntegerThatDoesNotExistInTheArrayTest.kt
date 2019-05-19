package daily.coding.problem.day4
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class FindTheLowestPositiveIntegerThatDoesNotExistInTheArrayTest {
    @Test
    fun `should give 1 as the lowest int for an element array`() {
        assertThat(FindTheLowestPositiveIntegerThatDoesNotExistInTheArray(emptyList<Int>())).isEqualTo(1)
    }

}
