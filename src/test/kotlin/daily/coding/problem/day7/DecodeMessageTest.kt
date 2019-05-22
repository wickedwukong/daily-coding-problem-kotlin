package daily.coding.problem.day7

import kotlin.test.Test
import org.assertj.core.api.Assertions.assertThat

class DecodeMessageTest {

    @Test
    fun `should have 0 ways of decoding for empty string`() {
        assertThat(decodeMessage("")).isEqualTo(0)
    }

    @Test
    fun `should have 1 way of decoding for 1 digit`() {
        assertThat(decodeMessage("1")).isEqualTo(1)
    }

    @Test
    fun `should have 2 way of decoding for double digits`() {
        assertThat(decodeMessage("11")).isEqualTo(2)
    }

    @Test
    fun `should have 3 way of decoding for sample data`() {
        assertThat(decodeMessage("111")).isEqualTo(3)
    }

    @Test
    fun `should have 5 way of decoding for 4 digits`() {
        assertThat(decodeMessage("1111")).isEqualTo(5)
    }

    @Test
    fun `should have 6 way of decoding for 4 digits`() {
        assertThat(decodeMessage("11111")).isEqualTo(8)
    }

    @Test
    fun `should not count the decoding ways where a double digits is outside encoding range - greater than 26`() {
        assertThat(decodeMessage("27")).isEqualTo(1)
        assertThat(decodeMessage("127")).isEqualTo(2)
        assertThat(decodeMessage("1271")).isEqualTo(2)
        assertThat(decodeMessage("127127")).isEqualTo(4)
        assertThat(decodeMessage("1271271")).isEqualTo(4)
        assertThat(decodeMessage("12712711")).isEqualTo(8)
    }
}
