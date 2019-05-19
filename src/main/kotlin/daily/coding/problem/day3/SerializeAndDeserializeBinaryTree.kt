package daily.coding.problem.day3


/*
The form of the serialization chosen for the algorithm
1
/ \
2   3
/ \
4   5

as "[1,2,3,null,null,4,5]"

*/
data class Node(val value: String, val left: Node?, val right: Node?)

fun Node.serialize(): String {
    return serialize(serialize(listOf(this.value, left?.value, right?.value), this.left), this.right).joinToString(",")
}

fun serialize(nodesSerializedSoFar: List<String?>, left: Node?): List<String?> {
    return left?.let {
        nodesSerializedSoFar.plus(it.left?.value).plus(it.right?.value)
    }?:nodesSerializedSoFar
}
