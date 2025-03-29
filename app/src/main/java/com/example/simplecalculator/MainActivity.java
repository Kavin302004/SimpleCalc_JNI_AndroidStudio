package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.simplecalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'simplecalculator' library on application startup.
    static {
        System.loadLibrary("simplecalculator");
    }

    private ActivityMainBinding binding;
    private StringBuilder history = new StringBuilder();
    Button buttonAdd,buttonSub,buttonMul,buttonDiv;
    EditText editTextN1,editTextN2;
    TextView  textView;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnAdd.setOnClickListener(v->calculate("add"));
        binding.btnSub.setOnClickListener(v->calculate("sub"));
        binding.btnMul.setOnClickListener(v->calculate("mul"));
        binding.btnDiv.setOnClickListener(v->calculate("div"));

        // Example of a call to a native method

    }
    private void calculate(String operation) {
        double num1 = Double.parseDouble(binding.number1.getText().toString());
        double num2 = Double.parseDouble(binding.number2.getText().toString());
        double result=0;
        switch (operation) {
            case "add":
                result = add(num1,num2);
                break;
            case "sub":
                result = sub(num1,num2);
                break;
            case "mul":
                result = mul(num1,num2);
                break;
            case "div":
                result = div(num1,num2);
                break;
        }
        binding.answer.setText("Result:"+result);
        // Update history
        String historyEntry = num1 + " " + getSymbol(operation) + " " + num2 + " = " + result + "\n";
        history.insert(0, historyEntry); // Insert at the beginning to show recent calculations first
        binding.historyText.setText(history.toString());
    }
    private String getSymbol(String operation) {
        switch (operation) {
            case "add": return "+";
            case "sub": return "-";
            case "mul": return "×";
            case "div": return "÷";
            default: return "";
        }
    }

    /**
     * A native method that is implemented by the 'simplecalculator' native library,
     * which is packaged with this application.
     */

    public native double add(double a,double b);
    public native double sub(double a,double b);
    public native double mul(double a,double b);
    public native double div(double a,double b);

}