class Calculator {

    fun parse(expression: String): Int {
        val valuesSplitted = splitString(expression)
        val result = when (valuesSplitted[1]) {
            "/" -> {
                valuesSplitted[0].toInt() / valuesSplitted[2].toInt()
            }
            else -> {
                valuesSplitted[0].toInt() * valuesSplitted[2].toInt()

            }
        }
        return result
    }

    fun splitString(expression: String) = expression.split(" ")


}
