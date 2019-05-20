package daily.coding.problem.day5

import daily.coding.problem.day5.ReturnFirstAndLastElementofPair.cons
import daily.coding.problem.day5.ReturnFirstAndLastElementofPair.car
import daily.coding.problem.day5.ReturnFirstAndLastElementofPair.cdr
import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class ReturnFirstAndLastElementOfPairTest {

    @Test
    fun `car should return the first element pair`() {
        assertThat(car(cons(3, 4))).isEqualTo(3)
    }

    @Test
    fun `cdr should return the second element pair`() {
        assertThat(cdr(cons(3, 4))).isEqualTo(4)
    }
}
