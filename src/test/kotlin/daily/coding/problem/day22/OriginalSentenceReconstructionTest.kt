package daily.coding.problem.day22

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class OriginalSentenceReconstructionTest {

    @Test
    fun `should have no reconstruction when dictionary is empty`() {
        assertThat(OriginalSentenceReconstruction("fox", emptyList())).isEqualTo(emptyList<String>())
    }

    @Test
    fun `should have no reconstruction when sentence is empty`() {
        assertThat(OriginalSentenceReconstruction("", listOf("fox"))).isEqualTo(emptyList<String>())
        assertThat(OriginalSentenceReconstruction("", listOf(""))).isEqualTo(emptyList<String>())
    }
}
