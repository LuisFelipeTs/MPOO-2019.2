package com.ufrpe.bsi.cadastrarconvidados.convidado.gui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ufrpe.bsi.cadastrarconvidados.R;
import com.ufrpe.bsi.cadastrarconvidados.convidado.dominio.Convidado;

import java.util.List;

public class RecyclerConvidadosAdapter extends RecyclerView.Adapter<RecyclerConvidadosAdapter.RecyViewHolder> {
    private List<Convidado> opcoesConvidados;

    public RecyclerConvidadosAdapter(List<Convidado> opcoesConvidados) {
        this.opcoesConvidados = opcoesConvidados;
    }

    @NonNull
    @Override
    public RecyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.convidados_card, viewGroup, false);
        return new RecyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyViewHolder holder, int position) {
        Convidado convidado = opcoesConvidados.get(position);
        holder.nomeConvidado.setText(convidado.getNome());
        holder.idadeConvidado.setText(String.valueOf(convidado.getIdade()));
        holder.idConvidado.setText(String.valueOf(convidado.getId()));
    }

    @Override
    public int getItemCount() {
        return (opcoesConvidados != null && (!opcoesConvidados.isEmpty()) ? opcoesConvidados.size() : 0) ;
    }

    public List<Convidado> getItems() {
        return opcoesConvidados;
    }

    static class RecyViewHolder extends RecyclerView.ViewHolder {
        private TextView nomeConvidado;
        private TextView idadeConvidado;
        private TextView idConvidado;;

        public RecyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomeConvidado = itemView.findViewById(R.id.nomeConvidado);
            idadeConvidado = itemView.findViewById(R.id.idadeConvidado);
            idConvidado = itemView.findViewById(R.id.idConvidado);
        }
    }
}
