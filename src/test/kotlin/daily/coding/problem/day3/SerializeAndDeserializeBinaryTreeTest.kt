package daily.coding.problem.day3

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class SerializeAndDeserializeBinaryTreeTest {
    @Test
    fun `should serialize & deserialize a single node binary tree`() {
        val singleNodeBinaryTree = Node("root", null, null)

        assertThat(singleNodeBinaryTree.serialize()).isEqualTo("root,null,null")
        assertThat(Node.deserialize("root,null,null")).isEqualTo(singleNodeBinaryTree)
    }

    @Test
    fun `should serialize a binary tree - a root and one single left child node`() {
        val rootWithOneSingleLeftChildBinaryTree = Node("root", Node("left", null, null), null)

        assertThat(rootWithOneSingleLeftChildBinaryTree.serialize()).isEqualTo("root,left,null,null,null")
        assertThat(Node.deserialize("root,left,null,null,null")).isEqualTo(rootWithOneSingleLeftChildBinaryTree)
    }

    @Test
    fun `should serialize a binary tree with - root and one single right child`() {
        val rootWithOneSingleRightChildBinaryTree = Node("root", null, Node("right", null, null))

        assertThat(rootWithOneSingleRightChildBinaryTree.serialize()).isEqualTo("root,null,right,null,null")
        assertThat(Node.deserialize("root,null,right,null,null")).isEqualTo(rootWithOneSingleRightChildBinaryTree)
    }

    @Test
    fun `should serialize a binary tree - a root with one single right child and one single left child node`() {
        val rootWithOneSingleRightChildBinaryTree = Node("root", Node("left", null, null), Node("right", null, null))

        assertThat(rootWithOneSingleRightChildBinaryTree.serialize()).isEqualTo("root,left,null,null,right,null,null")
        assertThat(Node.deserialize("root,left,null,null,right,null,null")).isEqualTo(rootWithOneSingleRightChildBinaryTree)
    }

    @Test
    fun `should serialize a binary tree - a root with one left child and one left grand child`() {
        val rootWithOneLeftChildAndOneLeftGrandChild = Node("root",
                Node("left", Node("left.left", null, null), null), null)

        assertThat(rootWithOneLeftChildAndOneLeftGrandChild.serialize()).isEqualTo("root,left,left.left,null,null,null,null")
        assertThat(Node.deserialize("root,left,left.left,null,null,null,null")).isEqualTo(rootWithOneLeftChildAndOneLeftGrandChild)
    }

    @Test
    fun `should serialize a binary tree - a root with left child and one left grand child, one right grand child`() {
        val rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild = Node("root",
                Node("left", Node("left.left", null, null), Node("left.right", null, null)), null)

        assertThat(rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild.serialize()).isEqualTo("root,left,left.left,null,null,left.right,null,null,null")
        assertThat(Node.deserialize("root,left,left.left,null,null,left.right,null,null,null")).isEqualTo(rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild)
    }

    /*
    1
      \
       2
      /
     3
   */
    @Test
    fun `should serialize a binary tree - a root with a right child and one right left grand child`() {
        val rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild = Node("1", null,
                Node("2", Node("3", null, null), null))

        assertThat(rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild.serialize()).isEqualTo("1,null,2,3,null,null,null")
        assertThat(Node.deserialize("1,null,2,3,null,null,null")).isEqualTo(rootWithOneLeftChildAndOneLeftGrandChildOneRightGrandChild)
    }

    /*
    *                     5
    *                    / \
    *                   4   7
    *                  /    /
    *                 3    2
    *                /    /
    *              -1    9
    * */

    @Test
    fun `should serialize a binary tree - a more complicated example`() {
        val aComplicatedBinaryTree = Node("5",
                Node("4", Node("3",
                        Node("-1", null, null), null), null),
                Node("7",
                        Node("2", Node("9", null, null), null), null))

        assertThat(aComplicatedBinaryTree.serialize()).isEqualTo("5,4,3,-1,null,null,null,null,7,2,9,null,null,null,null")
        assertThat(Node.deserialize("5,4,3,-1,null,null,null,null,7,2,9,null,null,null,null")).isEqualTo(aComplicatedBinaryTree)
    }

    /*
    *                      5
    *                    /   \
    *                   4     7
    *                  / \    /
    *                 3  10  2
    *                /      / \
    *              -1      9  13
    *                \    /
    *                11  12
    * */

    @Test
    fun `should serialize a binary tree - a more complicated example 2`() {
        val aComplicatedBinaryTree = Node("5",
                Node("4",
                        Node("3",
                                Node("-1",
                                        null,
                                        Node("11", null, null)),
                                null),
                        Node("10", null, null)),
                Node("7",
                        Node("2",
                                Node("9",
                                        Node("12", null, null),
                                        null),
                                Node("13", null, null)),
                        null))

        assertThat(aComplicatedBinaryTree.serialize()).isEqualTo("5,4,3,-1,null,11,null,null,null,10,null,null,7,2,9,12,null,null,null,13,null,null,null")
        assertThat(Node.deserialize("5,4,3,-1,null,11,null,null,null,10,null,null,7,2,9,12,null,null,null,13,null,null,null")).isEqualTo(aComplicatedBinaryTree)
    }

    @Test
    fun `should serialize a binary tree - a root with one level left child, and 2 level of right children - sample data`() {
        val rootWithOneSingleRightChildBinaryTree =
                Node("1", Node("2", null, null), Node("3", Node("4", null, null), Node("5", null, null)))

        assertThat(rootWithOneSingleRightChildBinaryTree.serialize()).isEqualTo("1,2,null,null,3,4,null,null,5,null,null")
        assertThat(Node.deserialize("1,2,null,null,3,4,null,null,5,null,null")).isEqualTo(rootWithOneSingleRightChildBinaryTree)
    }
}
