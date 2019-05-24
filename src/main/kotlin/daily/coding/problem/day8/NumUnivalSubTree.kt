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
    var total = 0
    if (isUnivalTree(tree)) {
        total += 1
    }

    tree.left?.let {
        total += numUnivalTree(it)
    }

    tree.right?.let {
        total += numUnivalTree(it)
    }
    return total
}

fun isUnivalTree(parent: Node): Boolean {
    return if (parent.left == null && parent.right == null) {
        true
    } else if (parent.value != parent.left?.value || parent.value != parent.right?.value) {
        false
    } else isUnivalTree(parent.left) && isUnivalTree(parent.right)
}

data class Node(val value: Int, val left: Node?, val right: Node?)
