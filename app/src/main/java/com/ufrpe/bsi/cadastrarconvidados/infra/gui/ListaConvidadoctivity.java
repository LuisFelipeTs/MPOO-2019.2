package com.ufrpe.bsi.cadastrarconvidados.infra.gui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ufrpe.bsi.cadastrarconvidados.R;
import com.ufrpe.bsi.cadastrarconvidados.convidado.dominio.Convidado;
import com.ufrpe.bsi.cadastrarconvidados.convidado.gui.CadastrarConvidadoActivity;
import com.ufrpe.bsi.cadastrarconvidados.convidado.gui.RecyclerConvidadosAdapter;
import com.ufrpe.bsi.cadastrarconvidados.convidado.negocio.ConvidadoServices;

import java.util.List;

public class ListaConvidadoctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_convidadoctivity);

        getSupportActionBar().hide();

        RecyclerView recyclerView = findViewById(R.id.recyclerConvidados);
        setupRecyclerView(recyclerView);

        Button btnIrCadastrar = (Button)findViewById(R.id.btnAdicionarConvidado);
        btnIrCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext() , CadastrarConvidadoActivity.class));
            }
        });

    }

    private void setupRecyclerView(RecyclerView recyclerView) {
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new RecyclerConvidadosAdapter(createList()));
    }

    private List<Convidado> createList() {
        ConvidadoServices convidadoServices = new ConvidadoServices(this);
        List<Convidado> convidados = null;
        convidados = convidadoServices.list();
        return convidados;
    }



}
