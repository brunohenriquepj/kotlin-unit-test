import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestWithMockk1 {
    @Test
    fun `calculate adds values`() {
        val doc1 = mockk<Depedency1>()
        val doc2 = mockk<Depedency2>()

        every { doc1.value1 } returns 5
        every { doc2.value2 } returns "6"

        var actual = SystemUnderTest(doc1, doc2).calculate()

        assertEquals(11, actual)

        verify(exactly = 1) {
            doc1.value1
            doc2.value2
        }
    }
}