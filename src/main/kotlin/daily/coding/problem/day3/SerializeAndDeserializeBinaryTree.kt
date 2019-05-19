package daily.coding.problem.day3


/*
The form of the serialization chosen for the algorithm
  1
 / \
2   3
    / \
   4   5

as "[1,2,null,null,3,4,null,null,5,null,null]"

*/
data class Node(val value: String, val left: Node?, val right: Node?) {
    companion object {
        fun deserialize(serialized: String): Node {
            val nodeValues = serialized.split(",")

            fun deserializeChildrenNodes(index: Int): Pair<Node?, Int> {
                fun parentNodeValue() = nodeValues[index]

                if (parentNodeValue() == "null") {
                    return Pair(null, index + 1)
                }

                val leftChild = deserializeChildrenNodes(index + 1)
                val rightChild = deserializeChildrenNodes(leftChild.second)

                return Pair(Node(parentNodeValue(), leftChild.first, rightChild.first), rightChild.second)
            }

            val leftChildNode = deserializeChildrenNodes(1)
            val rightChildNode = deserializeChildrenNodes(leftChildNode.second)

            val rootNodeValue = nodeValues.first()
            return Node(rootNodeValue, leftChildNode.first, rightChildNode.first)
        }
    }
}

fun Node.serialize(): String {
    return doSerialize(this)
}

private fun doSerialize(node: Node?): String {
    if (node == null) {
        return "null"
    }

    return "${node.value},${doSerialize(node.left)},${doSerialize(node.right)}"
}

