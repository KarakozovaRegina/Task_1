package krv.fit.bstu.task_1

import android.util.Log

class Operation(val stringOperation: String, val last_result:String) {

    private var numberLeft: String = ""
    private var operation: String = ""
    private var numberRight: String = ""
    private var number: String = ""

    private var lastNumber: String = ""
    private var lastOperator: String = ""

    //string
    private fun getParts(){

        if(last_result == ""){
            if (stringOperation.contains(" ")) {
                val parts = stringOperation.split(" ")
                numberLeft = parts[0]
                operation = parts[1]
                numberRight = parts[2]
                Log.e("SSS", "$numberLeft")
                Log.e("SSS", "$operation")
                Log.e("SSS", "$numberRight")
            } else {
                number = stringOperation
                Log.e("SSS", "$number")
            }
        } else{
            if (stringOperation.contains(" ")) {
                val parts = stringOperation.split(" ")
                lastNumber = parts.lastOrNull() ?: ""
                lastOperator = if (parts.size > 1) parts[parts.size - 2] else ""
        }
        }

    }


    fun basicCalculate(): String {
        getParts()
        if(last_result == ""){
            return when (operation) {
                "+" -> (numberLeft.toDouble() + numberRight.toDouble()).toString()
                "-" -> (numberLeft.toDouble() - numberRight.toDouble()).toString()
                "*" -> (numberLeft.toDouble() * numberRight.toDouble()).toString()
                "/" -> if (numberRight.toDouble() != 0.0) (numberLeft.toDouble() / numberRight.toDouble()).toString() else throw IllegalArgumentException("Деление на ноль")
                else -> throw IllegalArgumentException("такой операции нет")
            }
        }else
        {
             return when (lastOperator) {
                "+" -> (last_result.toDouble() + lastNumber.toDouble()).toString()
                "-" -> (last_result.toDouble() - lastNumber.toDouble()).toString()
                "*" -> (last_result.toDouble() * lastNumber.toDouble()).toString()
                "/" -> if (last_result.toDouble() != 0.0) (last_result.toDouble() / lastNumber.toDouble()).toString() else throw IllegalArgumentException("Деление на ноль")
                else -> throw IllegalArgumentException("такой операции нет")
            }
        }

    }

    fun getPercent():  String {
        getParts()
        val result = (number.toDouble() / 100).toString()
        return result
    }
}