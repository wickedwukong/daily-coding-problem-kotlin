/*
This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.
*/

package daily.coding.problem.day7

fun numEncoding(message: String): Int {
    if (message.startsWith("0")) return 0
    if (message.length <= 1) return 1

    var total = 0

    if (message.substring(0, 2).toInt() <= 26) {
        total += numEncoding(message.substring(2))
    }
    total += numEncoding(message.substring(1))

    return total
}
