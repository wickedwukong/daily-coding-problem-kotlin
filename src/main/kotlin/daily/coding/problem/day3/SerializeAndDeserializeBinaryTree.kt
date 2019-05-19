package daily.coding.problem.day3


data class Node(val value: String, val left: Node?, val right: Node?)

fun Node.serialize(): String {
    return "${this.value},${left?.value},${right?.value}"
}
