class Calculator {

    fun parse(expression: String): Int {
        val (a, operator, b) = splitString(expression)
        val result = when (operator) {
            "/" -> {
                a.toInt() / b.toInt()
            }
            "+" -> {
                a.toInt() + b.toInt()
            }
            else -> {
                a.toInt() * b.toInt()

            }
        }
        return result
    }

    fun splitString(expression: String) = expression.split(" ")


}
