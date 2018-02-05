package com.example.didact.u3_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellido, etResultadoCompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText)findViewById(R.id.etNombre);
        etApellido=(EditText)findViewById(R.id.etApellido);
        etResultadoCompleto=(EditText)findViewById(R.id.etResultado);


    }//FIN onCreate

    public void obtenerNombreCompleto (View view){

        //Recogemos el valor de los ET nombre y apellidos
        String nombre = etNombre.getText().toString();
        String apellidos = etApellido.getText().toString();

        if (nombre.equals("") || apellidos.equals("")){
            Toast.makeText(getApplicationContext(),"Debes rellenar nombre y apellidos.",
                    Toast.LENGTH_LONG).show();

        }else{
            etResultadoCompleto.setText(nombre+" "+apellidos);

        }

    }


}//FIN MainActivity
