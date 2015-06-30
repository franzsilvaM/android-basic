package com.example.franzsilva.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button[] buttons;
    private TextView pantalla;
    private boolean flagPunto=false;
    private boolean flagPlus=false;
    private boolean flagLess=false;
    private boolean flagMul=false;
    private boolean flagDiv=false;
    private double num1=0;
    private double num2=0;
    private double result=0;
    private int numContr=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = (TextView)findViewById(R.id.result);
        buttons = new Button[18];
        buttons[0]=(Button)findViewById(R.id.button0);
        buttons[1]=(Button)findViewById(R.id.button1);
        buttons[2]=(Button)findViewById(R.id.button2);
        buttons[3]=(Button)findViewById(R.id.button3);
        buttons[4]=(Button)findViewById(R.id.button4);
        buttons[5]=(Button)findViewById(R.id.button5);
        buttons[6]=(Button)findViewById(R.id.button6);
        buttons[7]=(Button)findViewById(R.id.button7);
        buttons[8]=(Button)findViewById(R.id.button8);
        buttons[9]=(Button)findViewById(R.id.button9);
        buttons[10]=(Button)findViewById(R.id.buttonPlus);
        buttons[11]=(Button)findViewById(R.id.buttonLess);
        buttons[12]=(Button)findViewById(R.id.buttonMul);
        buttons[13]=(Button)findViewById(R.id.buttonDiv);
        buttons[14]=(Button)findViewById(R.id.buttonP);
        buttons[15]=(Button)findViewById(R.id.buttonClear);
        buttons[16]=(Button)findViewById(R.id.buttonIgual);
        buttons[17]=(Button)findViewById(R.id.buttonOxo);
        for(Button btn : buttons){
            btn.setOnClickListener(this);
        }

    }
    @Override
    public void onClick(View v) {
        String auxPantalla = pantalla.getText().toString();

        int pressed=v.getId();
            try{
                switch (pressed) {
                    case R.id.button0:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "0");
                        break;
                    case R.id.button1:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "1");
                        break;
                    case R.id.button2:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "2");
                        break;
                    case R.id.button3:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "3");
                        break;
                    case R.id.button4:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }

                        pantalla.setText(auxPantalla + "4");
                        break;
                    case R.id.button5:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "5");
                        break;
                    case R.id.button6:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "6");
                        break;
                    case R.id.button7:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "7");
                        break;
                    case R.id.button8:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "8");
                        break;
                    case R.id.button9:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        pantalla.setText(auxPantalla + "9");
                        break;
                    case R.id.buttonP:
                        if (numContr == 0) {
                            pantalla.setText("");
                            auxPantalla = pantalla.getText().toString();
                            numContr = 1;
                        }
                        if (!flagPunto) {
                            pantalla.setText(auxPantalla + ".");
                            flagPunto = true;
                        }
                        break;
                    case R.id.buttonPlus:
                        if (!flagPlus) {
                            num1 = Double.parseDouble(auxPantalla);
                            pantalla.setText("");
                            flagPlus = true;
                            numContr = 1;
                        } else {
                            num1 = num1 + Double.parseDouble(auxPantalla);
                            pantalla.setText(num1 + "");
                            //flagPlus =false;
                            numContr = 0;
                        }
                        flagPunto = false;
                        flagDiv=false;
                        flagMul=false;
                        flagLess=false;
                        break;
                    case R.id.buttonLess:
                        if (!flagLess) {
                            num1 = Double.parseDouble(auxPantalla);
                            pantalla.setText("");
                            flagLess = true;
                            numContr = 1;
                        } else {
                            num1 = num1 - Double.parseDouble(auxPantalla);
                            pantalla.setText(num1 + "");
                            //flagPlus =false;
                            numContr = 0;
                        }
                        flagPunto = false;
                        flagPlus=false;
                        flagMul=false;
                        flagDiv=false;
                        break;
                    case R.id.buttonMul:
                        if (!flagMul) {
                            num1 = Double.parseDouble(auxPantalla);
                            pantalla.setText("");
                            flagMul = true;
                            numContr = 1;
                        } else {
                            num1 = num1 * Double.parseDouble(auxPantalla);
                            pantalla.setText(num1 + "");
                            //flagPlus =false;
                            numContr = 0;
                        }
                        flagPunto = false;
                        flagPlus=false;
                        flagDiv=false;
                        flagLess=false;
                        break;
                    case R.id.buttonDiv:
                        if (!flagDiv) {
                            num1 = Double.parseDouble(auxPantalla);
                            pantalla.setText("");
                            flagDiv = true;
                            numContr = 1;
                        } else {
                            num1 = num1 / Double.parseDouble(auxPantalla);
                            pantalla.setText(num1 + "");
                            //flagPlus =false;
                            numContr = 0;
                        }
                        flagPunto = false;
                        flagMul=false;
                        flagPlus=false;
                        flagLess=false;
                        break;
                    case R.id.buttonIgual:
                        numContr = 0;
                        num2 = Double.parseDouble(pantalla.getText().toString());
                        if (flagPlus) {
                            result = num1 + num2;
                            pantalla.setText(result + "");
                            flagPlus = false;

                        } else if (flagLess) {
                            result = num1 - num2;
                            pantalla.setText(result + "");
                            flagLess = false;
                        } else if (flagMul) {
                            result = num1 * num2;
                            pantalla.setText(result + "");
                            flagLess = false;
                        } else if (flagDiv) {
                            result = num1 / num2;
                            pantalla.setText(result + "");
                            flagLess = false;
                        }
                        flagPunto = false;
                        break;
                    case R.id.buttonClear:
                        pantalla.setText("");
                        flagMul = false;
                        flagLess = false;
                        flagPlus = false;
                        flagDiv = false;
                        flagPunto = false;
                        numContr = 0;
                        num1 = 0;
                        num2 = 0;
                        break;
                    case R.id.buttonOxo:
                        if (!(auxPantalla.equals("")) && !(auxPantalla.equals("SyntaxError"))) {
                            pantalla.setText(auxPantalla.substring(0, auxPantalla.length() - 1));
                        }
                        break;
                }
            }catch(Exception e){
                pantalla.setText("SyntaxError");
            }

    }
}