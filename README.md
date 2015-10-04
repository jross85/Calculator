# Calculator
Calculator app for Android

Calculator app created for Android in Android Studio.

Does all basic arithmetic and inlcludes a 'clear' that clears both inputs and resets the input fields. Also defaults back to first input field upon clearing.

Also checks if input is a number or not.

Example: 

```java 
 if (operand1.getText().length() > 0 && (operand2.getText().length()> 0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString()); //grabs value converts to string then starts to process it as a number
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult)); //show the result of the addition
                } else {
                    Toast.makeText(MainActivity.this, "that is not a number! enter a number.", Toast.LENGTH_SHORT).show();
                }
            }
```
