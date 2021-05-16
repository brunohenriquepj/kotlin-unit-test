import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestWithMockk2 {
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