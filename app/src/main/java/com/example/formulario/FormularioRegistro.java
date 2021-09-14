package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormularioRegistro extends AppCompatActivity {
    Button btnCancelar,btnGuardar;
    EditText txtNombre,txtTel,txtCorreo,txtContra;

    public void btnGuardarOnClick(View view) {
        Usuario user;
        txtTel=findViewById(R.id.txtTel);
        txtNombre=findViewById(R.id.txtNombre);
        txtCorreo=findViewById(R.id.txtEmail);
        txtContra=findViewById(R.id.txtContra);

        user=new Usuario(txtNombre.getText().toString(),Long.parseLong(txtTel.getText().toString()),
                txtCorreo.getText().toString(),txtContra.getText().toString());

        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        Bundle bundle=new Bundle();
        bundle.putSerializable("usuario",user);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCancelar=findViewById(R.id.btnCancelar);
        btnGuardar=findViewById(R.id.btnRegistro);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}