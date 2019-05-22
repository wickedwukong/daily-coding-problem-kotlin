/*
This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.
*/

package daily.coding.problem.day7

fun decodeMessage(message: String): Int {
    if (message.isEmpty()) return 0
    if (message.length == 1) return 1

    return when {
        messageIsDecodableDoubleDigits(message) -> decodeMessage(message.substring(1)) + 1
        firstTwoDigitsAreDecodable(message) -> decodeMessage(message.substring(1)) + decodeMessage(message.substring(2))
        else -> decodeMessage(message.substring(1))
    }
}

private fun firstTwoDigitsAreDecodable(message: String) = message.substring(0, 2).toInt() < 27

private fun messageIsDecodableDoubleDigits(message: String) = message.length == 2 && message.toInt() < 27
