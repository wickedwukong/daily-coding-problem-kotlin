package daily.coding.problem.kotlin.day1

import kotlin.random.Random
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

    @Test fun `should be false, when there are no two number found to add up to k`() {
        assertFalse(FindTwoNumbersAddUpToK(listOf(1,2), 4))
    }

    @Test fun `should be true, when there are two number adding up to k`() {
        assertTrue(FindTwoNumbersAddUpToK(listOf(1,2), 3))
    }

    @Test fun `should be true, when there are two number adding up to k - another list`() {
        assertTrue(FindTwoNumbersAddUpToK(listOf(3, 1,2, 5, 100 ,2, 100 -2, 34, 99), 100))
    }

    @Test fun `should be false, when there are NOT two number adding up to k - another list`() {
        assertFalse(FindTwoNumbersAddUpToK(listOf(3, 1,2, 5, 100 ,2, 100 -2, 34, 99), 1000))
    }

    @Test fun `should be true for the sample list in the problem statement`() {
        assertTrue(FindTwoNumbersAddUpToK(listOf(10, 15, 3, 7), 17))
    }
}
