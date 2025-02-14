package krv.fit.bstu.task_1

import android.util.Log

class Operation(val stringOperation: String) {

    var numberLeft: String = ""
    var operation: String = ""
    var numberRight: String = ""
    var number: String = ""

    //string
    fun getParts(){
        if (stringOperation.contains(" ")) {
            val parts = stringOperation.split(" ")
            numberLeft = parts[0]
            operation = parts[1]
            numberRight = parts[2]
        } else {
            number = stringOperation
        }

        Log.e("SSS", "$numberLeft")
        Log.e("SSS", "$operation")
        Log.e("SSS", "$numberRight")

    }


    fun basicCalculate(): String {
        getParts()
        return when (operation) {
            "+" -> (numberLeft.toDouble() + numberRight.toDouble()).toString()
            "-" -> (numberLeft.toDouble() - numberRight.toDouble()).toString()
            "*" -> (numberLeft.toDouble() * numberRight.toDouble()).toString()
            "/" -> if (numberRight.toDouble() != 0.0) (numberLeft.toDouble() / numberRight.toDouble()).toString() else throw IllegalArgumentException("Деление на ноль")
            else -> throw IllegalArgumentException("такой операции нет")
        }
    }

    fun getPercent():  String {
        getParts()
        val result = (number.toDouble() / 100).toString()
        return result
    }
}