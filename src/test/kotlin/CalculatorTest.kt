import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeTest
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun `should sum 3 plus 3`() {
        val result = calculator.parse("3 + 3")

        assertEquals(6, result)
    }


    @Test
    fun `Should multiply 2 by 2`() {

        val result = calculator.parse("2 * 2")

        assertEquals(4, result)

    }

    @Test
    fun `Should divide 2 by 2`() {

        val result = calculator.parse("2 / 2")

        assertEquals(1, result)
    }

    @Test
    fun `Ensure splitString() returns StringArray WHEN called`() {
        val expression = "2 / 2"
        val mapped = calculator.splitString(expression)
        val expected = expression.split(" ")

        assert(mapped == expected)
    }


}