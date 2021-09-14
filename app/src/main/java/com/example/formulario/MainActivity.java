package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText usuario,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.principal);

        usuario=findViewById(R.id.txtUsuarioLogin);
        boton=findViewById(R.id.btnRegistro);
        contra=findViewById(R.id.txtContraLogin);

        Bundle bundle = getIntent().getExtras();
        Usuario user=null;

        if(bundle!=null){
            user=(Usuario)bundle.getSerializable("usuario");
            usuario.setText(user.getNombre().toString());
            contra.setText(user.getContra().toString());
        }



        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),FormularioRegistro.class);
                startActivity(i);

            }
        });

    }


}