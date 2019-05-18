package daily.coding.problem.day1

import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import org.assertj.core.api.Assertions.assertThat

class FindTwoNumbersAddUpToKTest {
    @Test
    fun `should always be false, ie can never find two numbers adding up to k,  when the list is empty`() {
        val k = Random(System.currentTimeMillis()).nextInt()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(emptyList(), k)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(emptyList(), k)).isFalse()
    }

    @Test
    fun `should always be false, ie can never find two numbers adding up to k,  when the list only has one number`() {
        val i = Random(System.currentTimeMillis()).nextInt()
        val k = Random(System.currentTimeMillis()).nextInt()

        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(i), k)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(2), 2)).isFalse()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(i), k)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(2), 2)).isFalse()

    }

    @Test
    fun `should be false, when there are no two number found to add up to k`() {
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 2), 4)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(0, 1, 2), 4)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 0, 2), 4)).isFalse()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 2), 4)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(0, 1, 2), 4)).isFalse()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 0, 2), 4)).isFalse()
    }

    @Test
    fun `should be true, when there are two number adding up to k`() {
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 0, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 2, 0), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(0, 1, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(1, 2, 0), 3)).isTrue()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 0, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 2, 0), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(0, 1, 2), 3)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(1, 2, 0), 3)).isTrue()

    }

    @Test
    fun `should be true, when there are two number adding up to k - another list`() {
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99), 100)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99, 1), 100)).isTrue()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99), 100)).isTrue()
        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99, 1), 100)).isTrue()

    }

    @Test
    fun `should be false, when there are NOT two number adding up to k - another list`() {
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99), 1000)).isFalse()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(3, 1, 2, 5, 100, 2, 100, 34, 99), 1000)).isFalse()

    }

    @Test
    fun `should be true for the sample list in the problem statement`() {
        assertThat(FindTwoNumbersAddUpToKUsingPipeLine(listOf(10, 15, 3, 7), 17)).isTrue()

        assertThat(FindTwoNumbersAddUpToKUsingForLoop(listOf(10, 15, 3, 7), 17)).isTrue()
    }
}
