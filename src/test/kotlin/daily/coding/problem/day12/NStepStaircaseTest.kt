package daily.coding.problem.day12

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class NStepStaircaseTest {

    @Test
    fun `should have 0 way for 0 step staircase`() {
        assertThat(countUniqueWays(0)).isEqualTo(0)
    }

    @Test
    fun `should have 1 way for  step staircase`() {
        assertThat(countUniqueWays(1)).isEqualTo(1)
    }

    @Test
    fun `should have 2 way for  2 step staircase`() {
        assertThat(countUniqueWays(2)).isEqualTo(2)
    }

    @Test
    fun `should have 4 ways for 4 step staircase - sample date`() {
        assertThat(countUniqueWays(4)).isEqualTo(5)
    }

    @Test
    fun `more complicated cases`() {
        assertThat(countUniqueWays(5)).isEqualTo(8)
    }
}
