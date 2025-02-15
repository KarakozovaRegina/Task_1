package krv.fit.bstu.task_1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    var result_save: String = ""
    var last_result: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val text_operation: TextView = findViewById(R.id.operation)
        val text_result: TextView = findViewById(R.id.result)

        // finish operations
        val btn_delet: Button = findViewById(R.id.btn_delet)
        val btn_result: Button = findViewById(R.id.btn_result)

        // operations with number
        val btn_change_singn_number: Button = findViewById(R.id.change_sing_number)
        val btn_percent: Button = findViewById(R.id.operation_percent)
        val btn_division: Button = findViewById(R.id.operation_division)
        val btn_multiplication: Button = findViewById(R.id.operation_multiplication)
        val btn_minus: Button = findViewById(R.id.operation_minus)
        val btn_plus: Button = findViewById(R.id.operation_plus)
        val btn_point: Button = findViewById(R.id.operation_point)


        // numbers
        val btn_zero: Button = findViewById(R.id.zero)
        val btn_one: Button = findViewById(R.id.one)
        val btn_two: Button = findViewById(R.id.two)
        val btn_three: Button = findViewById(R.id.three)
        val btn_fore: Button = findViewById(R.id.four)
        val btn_five: Button = findViewById(R.id.five)
        val btn_six: Button = findViewById(R.id.six)
        val btn_seven: Button = findViewById(R.id.seven)
        val btn_eight: Button = findViewById(R.id.eight)
        val btn_nine: Button = findViewById(R.id.nine)

        // delete all textView
        btn_delet.setOnClickListener{
            text_operation.text = ""
            text_result.text = ""
            last_result = ""
        }

        // operation
        btn_change_singn_number.setOnClickListener{
            if(text_result.text.isEmpty()){
                val number:Double = text_operation.text.toString().toDouble()
                val changedNumber: Double = number * -1
                text_result.text = changedNumber.toString()
                text_operation.text = changedNumber.toString()
            } else{
                val number:Double = text_result.text.toString().toDouble()
                val changedNumber: Double = number * -1
                text_result.text = changedNumber.toString()
                text_operation.text = changedNumber.toString()
            }

        }
        btn_percent.setOnClickListener{
            if(last_result == "" && text_result.text ==""){
                val number:String = text_operation.text.toString()
                val operation: Operation = Operation(number,last_result)
                text_result.text = operation.getPercent()
            }else{
                val number:String = text_result.text.toString()
                val operation: Operation = Operation(number,last_result)
                text_result.text = operation.getPercent()
            }
        }
        btn_division.setOnClickListener{
            text_operation.append(" / ")
        }
        btn_multiplication.setOnClickListener{
            text_operation.append(" * ")
        }
        btn_minus.setOnClickListener{
            text_operation.append(" - ")
        }
        btn_plus.setOnClickListener{
            text_operation.append(" + ")
        }
        btn_point.setOnClickListener{
            text_operation.append(".")
        }

        //numbers
        btn_zero.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("0")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("0")
                }else{
                    text_operation.append("0")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_one.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("1")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("1")
                }else{
                    text_operation.append("1")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_two.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("2")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("2")
                }else{
                    text_operation.append("2")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
       }
        btn_three.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("3")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("3")
                }else{
                    text_operation.append("3")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_fore.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("4")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("4")
                }else{
                    text_operation.append("4")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_five.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("5")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("5")
                }else{
                    text_operation.append("5")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
       }
        btn_six.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("6")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("6")
                }else{
                    text_operation.append("6")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_seven.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("7")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("7")
                }else{
                    text_operation.append("7")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
       }
        btn_eight.setOnClickListener{
            if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                text_operation.append("8")
                val operation: Operation = Operation(text_operation.text.toString(),last_result)
                text_result.text = operation.basicCalculate()
                last_result = text_result.text.toString()
            }else{
                if (text_result.text == "" || last_result == ""){
                    text_operation.append("8")
                }else{
                    text_operation.append("8")
                    val operation: Operation = Operation(text_operation.text.toString(),last_result)
                    text_result.text = operation.basicCalculate()
                    last_result = text_result.text.toString()
                }
            }
        }
        btn_nine.setOnClickListener{
             if(text_operation.text.count { it == '-' } == 1 || text_operation.text.count { it == '+' } == 1 || text_operation.text.count { it == '*' } == 1 || text_operation.text.count { it == '/' } == 1){
                 text_operation.append("9")
                 val operation: Operation = Operation(text_operation.text.toString(),last_result)
                 text_result.text = operation.basicCalculate()
                 last_result = text_result.text.toString()
             }else{
                 if (text_result.text == "" || last_result == ""){
                     text_operation.append("9")
                 }else{
                     text_operation.append("9")
                     val operation: Operation = Operation(text_operation.text.toString(),last_result)
                     text_result.text = operation.basicCalculate()
                     last_result = text_result.text.toString()
                 }
             }

        }


        //result
        btn_result.setOnClickListener {
            val operation: Operation = Operation(text_operation.text.toString(),last_result)
            text_result.text = operation.basicCalculate()
            text_operation.text = text_result.text
            last_result = text_result.text.toString()
        }

    }



}