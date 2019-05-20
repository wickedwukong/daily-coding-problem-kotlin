package daily.coding.problem.day5

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class ReturnFirstAndLastElementOfPairTest {

    @Test
    fun `car should return the first element pair`() {
        assertThat(car(cons(3, 4))).isEqualTo(3)
        assertThat(car(cons("hello", "world"))).isEqualTo("hello")
        assertThat(car(cons(1, "world"))).isEqualTo(1)
    }

    @Test
    fun `cdr should return the second element pair`() {
        assertThat(cdr(cons(3, 4))).isEqualTo(4)
        assertThat(cdr(cons("hello", "world"))).isEqualTo("world")
        assertThat(cdr(cons(1, "world"))).isEqualTo("world")
    }
}
