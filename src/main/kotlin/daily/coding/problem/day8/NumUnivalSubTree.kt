/*
This is your coding interview problem for today.

This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

    0
   / \
  1   0
     / \
    1   0
   / \
  1   1

*/


package daily.coding.problem.day8

fun numUnivalTree(tree: Node): Int {
    return countOneIfItIsUnivalTree(tree) + numLeftSubUnivalTree(tree) + numRightSubUnivalTree(tree)
}

private fun countOneIfItIsUnivalTree(tree: Node): Int {
    return if (isUnivalTree(tree)) {
        1
    } else {
        0
    }
}

private fun numRightSubUnivalTree(tree: Node): Int {
    return tree.right?.let {
        numUnivalTree(it)
    } ?: 0
}

private fun numLeftSubUnivalTree(tree: Node): Int {
    return tree.left?.let {
        numUnivalTree(it)
    } ?: 0
}

fun isUnivalTree(parent: Node): Boolean {
    return if (parent.left == null && parent.right == null) {
        true
    } else if (parent.value != parent.left?.value || parent.value != parent.right?.value) {
        false
    } else isUnivalTree(parent.left) && isUnivalTree(parent.right)
}

data class Node(val value: Int, val left: Node?, val right: Node?)
