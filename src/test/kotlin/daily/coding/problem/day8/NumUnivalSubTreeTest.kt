package daily.coding.problem.day8

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class NumUnivalSubTreeTest {

    @Test
    fun `Single node tree should have 1 sub unival tree`() {
        assertThat(numUnivalTree(Node(1, null, null))).isEqualTo(1)
    }

    @Test
    fun `A root with one child who has the same value has 1 unival tree`() {
        assertThat(numUnivalTree(Node(1, Node(1, null, null), null))).isEqualTo(1)
        assertThat(numUnivalTree(Node(1, null, Node(1, null, null)))).isEqualTo(1)
    }

    @Test
    fun `A root with one child who has a different value has 1 unival tree`() {
        assertThat(numUnivalTree(Node(1, Node(2, null, null), null))).isEqualTo(1)
        assertThat(numUnivalTree(Node(1, null, Node(2, null, null)))).isEqualTo(1)
    }

    @Test
    fun `A root with two children, right and left, who have the same value has 3 unival tree`() {
        assertThat(numUnivalTree(Node(1, Node(1, null, null), Node(1, null, null)))).isEqualTo(3)
    }

    /*
      0
     / \
    1   0
       / \
      1   0
     / \
    1   1
    * */
    @Test
    fun `test sample data`() {
        assertThat(numUnivalTree(Node(0,
                Node(1, null, null),
                Node(0,
                        Node(1,
                                Node(1, null, null),
                                Node(1, null, null)),
                        Node(0, null, null))))).isEqualTo(5)
    }
}
