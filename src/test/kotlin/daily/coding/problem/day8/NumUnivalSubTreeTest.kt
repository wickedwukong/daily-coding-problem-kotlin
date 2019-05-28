package daily.coding.problem.day8

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class NumUnivalSubTreeTest {

    @Test
    fun `Single node tree should have 1 sub unival tree`() {
        val tree = Node(1, null, null)

        assertThat(numUnivalTree(tree)).isEqualTo(1)
        assertThat(numUnivalTreeInefficient(tree)).isEqualTo(1)
    }

    @Test
    fun `A root with one child who has the same value has 2 unival tree`() {
        val treeWithLeftChild = Node(1, Node(1, null, null), null)

        assertThat(numUnivalTree(treeWithLeftChild)).isEqualTo(2)
        assertThat(numUnivalTreeInefficient(treeWithLeftChild)).isEqualTo(2)

        val treeWithRightChild = Node(1, null, Node(1, null, null))

        assertThat(numUnivalTree(treeWithRightChild)).isEqualTo(2)
        assertThat(numUnivalTreeInefficient(treeWithRightChild)).isEqualTo(2)
    }

    @Test
    fun `A root with one child who has a different value has 1 unival tree`() {
        val treeWithLeftChild = Node(1, Node(2, null, null), null)

        assertThat(numUnivalTree(treeWithLeftChild)).isEqualTo(1)
        assertThat(numUnivalTreeInefficient(treeWithLeftChild)).isEqualTo(1)

        val treeWithRightChild = Node(1, null, Node(2, null, null))

        assertThat(numUnivalTree(treeWithRightChild)).isEqualTo(1)
        assertThat(numUnivalTreeInefficient(treeWithRightChild)).isEqualTo(1)
    }

    @Test
    fun `A root with two children, right and left, who have the same value has 3 unival tree`() {
        val tree = Node(1, Node(1, null, null), Node(1, null, null))

        assertThat(numUnivalTree(tree)).isEqualTo(3)
        assertThat(numUnivalTreeInefficient(tree)).isEqualTo(3)
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
        val tree = Node(0,
                Node(1, null, null),
                Node(0,
                        Node(1,
                                Node(1, null, null),
                                Node(1, null, null)),
                        Node(0, null, null)))

        assertThat(numUnivalTree(tree)).isEqualTo(5)
        assertThat(numUnivalTreeInefficient(tree)).isEqualTo(5)
    }

    /*
       a
      / \
     c   b
         /\
        b  b
            \
             b
* */

    @Test
    fun `test sample data - 2`() {
        val tree = Node('a',
                Node('c', null, null),
                Node('b',
                        Node('b', null, null),
                        Node('b',
                                null,
                                Node('b',
                                        null,
                                        null))))

        assertThat(numUnivalTree(tree)).isEqualTo(5)
        assertThat(numUnivalTreeInefficient(tree)).isEqualTo(5)
    }


/*
   a
  / \
 a   a
     /\
    a  a
        \
         A
* */

    @Test
    fun `test sample data - 3`() {
        val tree = Node("a",
                Node("a", null, null),
                Node("a",
                        Node("a", null, null),
                        Node("a",
                                null,
                                Node("A",
                                        null,
                                        null))))

        assertThat(numUnivalTree(tree)).isEqualTo(3)
        assertThat(numUnivalTreeInefficient(tree)).isEqualTo(3)
    }

}
