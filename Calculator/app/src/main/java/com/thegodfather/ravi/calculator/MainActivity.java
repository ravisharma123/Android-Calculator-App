package com.thegodfather.ravi.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
EditText numOne, numTwo, result;
double number, numberTwo, calculation;
String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numOne = (EditText) findViewById(R.id.textView);
        Button add = (Button) findViewById(R.id.button);
        Button equals = (Button) findViewById(R.id.button6);
        Button subtract = (Button) findViewById(R.id.button2);
        Button multiply = (Button) findViewById(R.id.button4);
        Button divide = (Button) findViewById(R.id.button3);
        Button power = (Button) findViewById(R.id.button5);
        result = (EditText) findViewById(R.id.textView2);
        operation="";
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=Double.parseDouble(numOne.getText().toString());
                operation="+";
                numOne.setText("");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=Double.parseDouble(numOne.getText().toString());
                operation="-";
                numOne.setText("");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=Double.parseDouble(numOne.getText().toString());
                operation="/";
                numOne.setText("");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=Double.parseDouble(numOne.getText().toString());
                operation="*";
                numOne.setText("");
            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number=Double.parseDouble(numOne.getText().toString());
                operation="^";
                numOne.setText("");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTwo = (EditText) findViewById(R.id.textView);
                numberTwo=Integer.parseInt(numTwo.getText().toString());
                if(operation.equals("+")){
                    calculation=number+numberTwo;
                    result.setText(""+calculation);
                }
                if(operation.equals("-")){
                    calculation=number-numberTwo;
                    result.setText(""+calculation);
                }
                if(operation.equals("/")){
                    calculation=number/numberTwo;
                    result.setText(""+calculation);
                }
                if(operation.equals("*")){
                    calculation=number*numberTwo;
                    result.setText(""+calculation);
                }
                if(operation.equals("^")){
                    calculation=Math.pow(number,numberTwo);
                    result.setText(""+calculation);
                }

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
