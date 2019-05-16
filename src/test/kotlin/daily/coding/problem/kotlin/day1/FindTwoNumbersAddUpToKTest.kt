package daily.coding.problem.kotlin.day1

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertFalse

class FindTwoNumbersAddUpToKTest {
    @Test fun `should always be false, ie can never find two numbers adding up to k,  when the list is empty`() {
        val k = Random(System.currentTimeMillis()).nextInt()
        assertFalse(FindTwoNumbersAddUpToK(emptyList(), k))
    }
}
