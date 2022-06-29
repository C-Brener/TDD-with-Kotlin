class Calculator {

    fun parse(expression: String): Int {
        val splitString = expression.split(" ")
        val result = when (splitString[1]) {
            "/" -> {
                splitString[0].toInt() / splitString[2].toInt()
            }
            else -> {
                splitString[0].toInt() * splitString[2].toInt()

            }
        }
        return result
    }

}
