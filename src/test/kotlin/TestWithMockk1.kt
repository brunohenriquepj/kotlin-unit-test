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

        val actual = SystemUnderTest(doc1, doc2).calculate()

        assertEquals(11, actual)

        verify(exactly = 1) {
            doc1.value1
            doc2.value2
        }
    }

    @Test
    fun `SystemUnderTest set values`() {
        val depedency1 = Depedency1(1)
        val depedency2 = Depedency2("2")

        val sut = SystemUnderTest(depedency1, depedency2)

        assertEquals(depedency1, sut.depedency1)
        assertEquals(depedency2, sut.depedency2)
    }

    @Test
    fun `dependency 1 set values`() {
        val depedency1 = Depedency1(1)
        assertEquals(1, depedency1.value1)
    }

    @Test
    fun `dependency 2 set values`() {
        val depedency2 = Depedency2("2")
        assertEquals("2", depedency2.value2)
    }
}