import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {


    @Test
    fun `Should multiply 2 by 2`() {

        val calculator = Calculator()

        val result = calculator.parse("2 * 2")

        assertEquals(4, result)

    }

    @Test
    fun `Should divide 2 by 2`() {

        val calculator = Calculator()

        val result = calculator.parse("2 / 2")

        assertEquals(1, result)
    }


}