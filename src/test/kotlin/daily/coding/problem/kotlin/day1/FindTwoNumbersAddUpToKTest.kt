package daily.coding.problem.kotlin.day1

import kotlin.random.Random
import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FindTwoNumbersAddUpToKTest {
    @Test fun `should always be false, ie can never find two numbers adding up to k,  when the list is empty`() {
        val k = Random(System.currentTimeMillis()).nextInt()
        assertFalse(FindTwoNumbersAddUpToK(emptyList(), k))
    }

    @Test fun `should always be false, ie can never find two numbers adding up to k,  when the list only has one number`() {
        val i = Random(System.currentTimeMillis()).nextInt()
        val k = Random(System.currentTimeMillis()).nextInt()
        assertFalse(FindTwoNumbersAddUpToK(listOf(i), k))
    }

    @Ignore fun `should be true for the sample list in the problem statement`() {
        assertTrue(FindTwoNumbersAddUpToK(listOf(10, 15, 3, 7), 17))
    }
}
