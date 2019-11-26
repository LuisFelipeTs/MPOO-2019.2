package com.ufrpe.bsi.cadastrarconvidados.convidado.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ufrpe.bsi.cadastrarconvidados.R;
import com.ufrpe.bsi.cadastrarconvidados.convidado.dominio.Convidado;
import com.ufrpe.bsi.cadastrarconvidados.convidado.negocio.ConvidadoServices;
import com.ufrpe.bsi.cadastrarconvidados.infra.gui.ListaConvidadoctivity;

public class CadastrarConvidadoActivity extends AppCompatActivity {

    private EditText editNome, editIdade;
    private ConvidadoServices convidadoServices = new ConvidadoServices(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_convidado);

        getSupportActionBar().hide();

        editNome = findViewById(R.id.editNome);
        editIdade = findViewById(R.id.editIdade);
        Button btnCadastrar = (Button) findViewById(R.id.btnaddParticipante);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrarUser();
                startActivity(new Intent(getApplicationContext(), ListaConvidadoctivity.class));
            }
        });

    }

    private void cadastrarUser(){
        String nome = editNome.getText().toString();
        String idade = editIdade.getText().toString();
        convidadoServices.cadastrarConvidado(new Convidado(nome,idade));

    }
}
