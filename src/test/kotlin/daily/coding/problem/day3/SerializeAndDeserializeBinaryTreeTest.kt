package daily.coding.problem.day3

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class SerializeAndDeserializeBinaryTreeTest {
    @Test
    fun `should serialize a single node binary tree`() {
        val singleNodeBinaryTree = Node("root", null, null)

        assertThat(singleNodeBinaryTree.serialize()).isEqualTo("root,null,null")
    }

    @Test
    fun `should serialize a binary tree with a root and one single left child`() {
        val rootWithOneSingleLeftChildBinaryTree = Node("root", Node("left", null, null), null)

        assertThat(rootWithOneSingleLeftChildBinaryTree.serialize()).isEqualTo("root,left,null,null,null")
    }

    @Test
    fun `should serialize a binary tree with a root and one single right child`() {
        val rootWithOneSingleRightChildBinaryTree = Node("root", null, Node("right", null, null))

        assertThat(rootWithOneSingleRightChildBinaryTree.serialize()).isEqualTo("root,null,right,null,null")
    }
}

