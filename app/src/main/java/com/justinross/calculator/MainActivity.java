package com.justinross.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare and initialize variables
    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private Button btnClear;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnClear = (Button) findViewById(R.id.btnClear);

        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && (operand2.getText().length()> 0)) { //checks if input is a number
                    double oper1 = Double.parseDouble(operand1.getText().toString()); //grabs value converts to string then starts to process it as a number
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult)); //show the result of the addition
                } else {
                    Toast.makeText(MainActivity.this, "That is not a number!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && (operand2.getText().length()> 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString()); //grabs value converts to string then starts to process it as a number
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult)); //show the result of the addition
                } else {
                    Toast.makeText(MainActivity.this, "that is not a number! enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && (operand2.getText().length()> 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString()); //grabs value converts to string then starts to process it as a number
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult)); //show the result of the addition
                } else {
                    Toast.makeText(MainActivity.this, "that is not a number! enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand1.getText().length() > 0 && (operand2.getText().length()> 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString()); //grabs value converts to string then starts to process it as a number
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult)); //show the result of the addition
                } else {
                    Toast.makeText(MainActivity.this, "that is not a number! enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override //clears the input fields and rests cursor to first input field
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("0.00");
                operand1.requestFocus();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
