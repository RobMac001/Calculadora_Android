package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText TextoResultado;
    private Button Button0;
    private Button Button1;
    private Button Button2;
    private Button Button3;
    private Button Button4;
    private Button Button5;
    private Button Button6;
    private Button Button7;
    private Button Button8;
    private Button Button9;
    private Button ButtonC;
    private Button ButtonR;
    private Button ButtonSuma;
    private Button ButtonResta;
    private Button ButtonMultiplicacion;
    private Button ButtonDivision;
    private Button ButtonGoma;
    private Button ButtonPunto;
    private Button getButtonIgual;

    private ExpresionRegular expresionRegular;
    private boolean clickSuma, clickResta, clickMultiplicar, clickDivision, clickSeparadorDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expresionRegular = new ExpresionRegular();

        TextoResultado = findViewById(R.id.label_resultado);
        TextoResultado.setFocusable(true);
        TextoResultado.setFocusableInTouchMode(true);
        TextoResultado.setInputType(InputType.TYPE_NULL);

        Button0 = findViewById(R.id.boton_0);
        Button0.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "0");
                accionesAdionales(R.id.boton_0);
            }
        });

        Button1 = findViewById(R.id.boton_1);
        Button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "1");
                accionesAdionales(R.id.boton_1);
            }
        });

        Button2 = findViewById(R.id.boton_2);
        Button2.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "2");
                accionesAdionales(R.id.boton_2);
            }
        });

        Button3 = findViewById(R.id.boton_3);
        Button3.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "3");
                accionesAdionales(R.id.boton_3);
            }
        });

        Button4 = findViewById(R.id.boton_4);
        Button4.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "4");
                accionesAdionales(R.id.boton_4);
            }
        });

        Button5 = findViewById(R.id.boton_5);
        Button5.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "5");
                accionesAdionales(R.id.boton_5);
            }
        });

        Button6 = findViewById(R.id.boton_6);
        Button6.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "6");
                accionesAdionales(R.id.boton_6);
            }
        });

        Button7 = findViewById(R.id.boton_7);
        Button7.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "7");
                accionesAdionales(R.id.boton_7);
            }
        });

        Button8 = findViewById(R.id.boton_8);
        Button8.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "8");
                accionesAdionales(R.id.boton_8);
            }
        });

        Button9 = findViewById(R.id.boton_9);
        Button9.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                TextoResultado.setText(textAnterior + "9");
                accionesAdionales(R.id.boton_9);
            }
        });

        ButtonC = findViewById(R.id.boton_cc);
        ButtonC.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextoResultado.setText("");
                accionesAdionales(R.id.boton_cc);
            }
        });

        ButtonR = findViewById(R.id.boton_r);
        ButtonR.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TextoResultado.setText("");
                Toast.makeText(MainActivity.this, "Hecho por Robert", Toast.LENGTH_LONG).show();
                accionesAdionales(R.id.boton_r);
            }
        });

        ButtonSuma = findViewById(R.id.boton_suma);
        ButtonSuma.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();

                if( textAnterior.trim().length() > 0 && clickSuma == false){

                    if( textAnterior.endsWith("*") || textAnterior.endsWith("/") || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        TextoResultado.setText( textAnterior );
                    }

                    TextoResultado.setText(textAnterior + "+");
                    clickSuma = true;
                    accionesAdionales(R.id.boton_suma);
                }
            }
        });

        ButtonResta = findViewById(R.id.boton_resta);
        ButtonResta.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();
                if( clickResta == false ){

                    if( textAnterior.endsWith("*") || textAnterior.endsWith("/") || textAnterior.endsWith("+")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        TextoResultado.setText( textAnterior );
                    }
                    TextoResultado.setText(textAnterior + "-");
                    clickResta = true;
                    accionesAdionales(R.id.boton_resta);
                }
            }
        });

        ButtonDivision = findViewById(R.id.boton_div);
        ButtonDivision.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();

                if( textAnterior.trim().length() > 0 && clickDivision == false){

                    if( textAnterior.endsWith("*") || textAnterior.endsWith("+") || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        TextoResultado.setText( textAnterior );
                    }

                    TextoResultado.setText(textAnterior + "/");
                    clickDivision = true;
                    accionesAdionales(R.id.boton_div);
                }
            }
        });
        ButtonMultiplicacion = findViewById(R.id.boton_mult);
        ButtonMultiplicacion.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();

                if( textAnterior.trim().length() > 0 && clickMultiplicar == false){

                    if( textAnterior.endsWith("+") || textAnterior.endsWith("/") || textAnterior.endsWith("-")){

                        textAnterior = textAnterior.substring(0, textAnterior.length() - 1);
                        TextoResultado.setText( textAnterior );
                    }
                    TextoResultado.setText(textAnterior + "*");
                    clickMultiplicar = true;
                    accionesAdionales(R.id.boton_mult);
                }
            }
        });

        ButtonGoma = findViewById(R.id.boton_goma);
        ButtonGoma.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String textAnterior = TextoResultado.getText().toString();
                if( textAnterior.length() > 0 ) {
                    String nuevaOperacion = textAnterior.substring(0, textAnterior.length() - 1);
                    TextoResultado.setText( nuevaOperacion );
                }

                accionesAdionales(R.id.boton_goma);
            }
        });

        ButtonPunto = findViewById(R.id.boton_punto);
        ButtonPunto.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();

                if( clickSeparadorDecimal == false){
                    TextoResultado.setText(textAnterior + ".");
                    clickSeparadorDecimal = true;
                    accionesAdionales(R.id.boton_punto);
                }
            }
        });

        getButtonIgual = findViewById(R.id.boton_igual);
        getButtonIgual.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String textAnterior = TextoResultado.getText().toString();

                if( textAnterior.trim().length() > 0 ){
                    String resultado = expresionRegular.resolverFormula( textAnterior.trim() );
                    TextoResultado.setText( resultado );
                }
            }
        });

    }

    /**
     *
     * @param idBotonActual
     */
    private void accionesAdionales( int idBotonActual ){

        if( idBotonActual != R.id.boton_suma ){
            clickSuma = false;
        }

        if( idBotonActual != R.id.boton_resta ){
            clickResta = false;
        }

        if( idBotonActual != R.id.boton_mult ){
            clickMultiplicar = false;
        }

        if( idBotonActual != R.id.boton_div ){
            clickDivision = false;
        }

        if( idBotonActual == R.id.boton_suma
                || idBotonActual == R.id.boton_resta
                || idBotonActual == R.id.boton_mult
                || idBotonActual == R.id.boton_div){
            clickSeparadorDecimal = false;
        }


    }
}