package daily.coding.problem.day7

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class DecodeMessageTest {

    @Test
    fun `should have 0 ways of decoding for empty string`() {
        assertThat(numEncoding("")).isEqualTo(1)

        assertThat(numEncodingRecursive("")).isEqualTo(1)
    }

    @Test
    fun `zeros`() {
        assertThat(numEncoding("30")).isEqualTo(0)
        assertThat(numEncoding("10")).isEqualTo(1)
        assertThat(numEncoding("011")).isEqualTo(0)
        assertThat(numEncoding("101")).isEqualTo(1)
        assertThat(numEncoding("110")).isEqualTo(1)
        assertThat(numEncoding("1010")).isEqualTo(1)
        assertThat(numEncoding("10101")).isEqualTo(1)
        assertThat(numEncoding("101011")).isEqualTo(2)
        assertThat(numEncoding("130")).isEqualTo(0)

        assertThat(numEncodingRecursive("30")).isEqualTo(0)
        assertThat(numEncodingRecursive("10")).isEqualTo(1)
        assertThat(numEncodingRecursive("011")).isEqualTo(0)
        assertThat(numEncodingRecursive("101")).isEqualTo(1)
        assertThat(numEncodingRecursive("110")).isEqualTo(1)
        assertThat(numEncodingRecursive("1010")).isEqualTo(1)
        assertThat(numEncodingRecursive("10101")).isEqualTo(1)
        assertThat(numEncodingRecursive("101011")).isEqualTo(2)
        assertThat(numEncodingRecursive("130")).isEqualTo(0)
    }

    @Test
    fun `should have 1 way of decoding for 1 digit`() {
        assertThat(numEncoding("1")).isEqualTo(1)

        assertThat(numEncodingRecursive("1")).isEqualTo(1)
    }

    @Test
    fun `should have 2 way of decoding for double digits`() {
        assertThat(numEncoding("11")).isEqualTo(2)

        assertThat(numEncodingRecursive("11")).isEqualTo(2)
    }

    @Test
    fun `should have 3 way of decoding for sample data`() {
        assertThat(numEncoding("111")).isEqualTo(3)

        assertThat(numEncodingRecursive("111")).isEqualTo(3)
    }

    @Test
    fun `should have 5 way of decoding for 4 digits`() {
        assertThat(numEncoding("1111")).isEqualTo(5)

        assertThat(numEncodingRecursive("1111")).isEqualTo(5)
    }

    @Test
    fun `should have 6 way of decoding for 4 digits`() {
        assertThat(numEncoding("11111")).isEqualTo(8)

        assertThat(numEncodingRecursive("11111")).isEqualTo(8)
    }

    @Test
    fun `should not count the decoding ways where a double digits is outside encoding range - greater than 26`() {
        assertThat(numEncoding("27")).isEqualTo(1)
        assertThat(numEncoding("127")).isEqualTo(2)
        assertThat(numEncoding("1271")).isEqualTo(2)
        assertThat(numEncoding("127127")).isEqualTo(4)
        assertThat(numEncoding("1271271")).isEqualTo(4)
        assertThat(numEncoding("12712711")).isEqualTo(8)

        assertThat(numEncodingRecursive("27")).isEqualTo(1)
        assertThat(numEncodingRecursive("127")).isEqualTo(2)
        assertThat(numEncodingRecursive("1271")).isEqualTo(2)
        assertThat(numEncodingRecursive("127127")).isEqualTo(4)
        assertThat(numEncodingRecursive("1271271")).isEqualTo(4)
        assertThat(numEncodingRecursive("12712711")).isEqualTo(8)
    }
}
