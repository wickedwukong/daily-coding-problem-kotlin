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

            val rootNodeValue = nodeValues.first()

            val leftChildNode = doIt(nodeValues.subList(1, nodeValues.size))
            val rightChildNode = doIt(leftChildNode.second)

            return Node(rootNodeValue, leftChildNode.first, rightChildNode.first)
        }

        private fun doIt(nodeValues: List<String>): Pair<Node?, List<String>> {
            val parentNodeValue = nodeValues.first()

            if (parentNodeValue == "null") {
                return Pair(null, nodeValues.subList(1, nodeValues.size))
            }

            val leftChildValue = doIt(nodeValues.subList(1, nodeValues.size))

            val rightChildValue = doIt(leftChildValue.second)

            return Pair(Node(parentNodeValue, leftChildValue.first, rightChildValue.first), rightChildValue.second)
        }
    }
}

fun Node.serialize(): String {
    return serialize(this, listOf(this.value)).joinToString(",")
}

private fun serialize(node: Node, nodesRenderSoFar: List<String?>): List<String?> {
    val nullString: String? = null
    val nodesSoFarIncludingLeftNodes = node.left?.let {
        serialize(it, nodesRenderSoFar.plus(it.value))
    } ?: nodesRenderSoFar.plus(nullString)

    return node.right?.let {
        serialize(it, nodesSoFarIncludingLeftNodes.plus(it.value))
    } ?: nodesSoFarIncludingLeftNodes.plus(nullString)
}

