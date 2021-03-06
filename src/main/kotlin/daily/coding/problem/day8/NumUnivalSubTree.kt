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

fun <T> numUnivalTree(tree: Node<T>): Int {
    val (count, _) = doIt(tree)
    return count
}

fun <T> doIt(tree: Node<T>?): Pair<Int, Boolean> {
    if (tree == null) {
        return Pair(0, true)
    }

    val (leftCount, isLeftUnival) = doIt(tree.left)
    val (rightCount, isRightUnival) = doIt(tree.right)
    val total = leftCount + rightCount

    return if (isLeftUnival && isRightUnival) {
        if (tree.value != tree.left?.value && tree.left != null) {
            Pair(total, false)
        } else if (tree.value != tree.right?.value && tree.right != null) {
            Pair(total, false)
        } else {
            return Pair(total + 1, true)
        }
    } else {
        Pair(total, false)
    }
}

fun <T> numUnivalTreeInefficient(tree: Node<T>): Int {
    return countOneIfItIsUnivalTree(tree) + numLeftSubUnivalTree(tree) + numRightSubUnivalTree(tree)
}

private fun <T> countOneIfItIsUnivalTree(tree: Node<T>): Int {
    return if (isUnivalTree(tree, tree.value)) {
        1
    } else {
        0
    }
}

private fun <T> numRightSubUnivalTree(tree: Node<T>): Int {
    return tree.right?.let {
        numUnivalTree(it)
    } ?: 0
}

private fun <T> numLeftSubUnivalTree(tree: Node<T>): Int {
    return tree.left?.let {
        numUnivalTree(it)
    } ?: 0
}

fun <T> isUnivalTree(parent: Node<T>?, value: T): Boolean {

    return when {
        parent == null -> true
        parent.value == value -> isUnivalTree(parent.left, value) && isUnivalTree(parent.right, value)
        else -> false
    }
}

data class Node<T>(val value: T, val left: Node<T>?, val right: Node<T>?)
