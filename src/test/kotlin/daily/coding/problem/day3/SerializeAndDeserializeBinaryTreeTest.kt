package daily.coding.problem.day3

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class SerializeAndDeserializeBinaryTreeTest {
    @Test
    fun `should serialize a single node binary tree`() {
        assertThat(Node("root", null, null).serialize()).isEqualTo("root,null,null")
    }
}

