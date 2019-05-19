package daily.coding.problem.day3


data class Node(val value: String, val left: Node?, val right: Node?)

fun Node.serialize(): String {
    return serialize(serialize(listOf(this.value, left?.value, right?.value), this.left), this.right).joinToString(",")
}

fun serialize(nodesSerializedSoFar: List<String?>, left: Node?): List<String?> {
    return left?.let {
        nodesSerializedSoFar.plus(it.left?.value).plus(it.right?.value)
    }?:nodesSerializedSoFar
}
