package com.ufrpe.bsi.cadastrarconvidados.convidado.negocio;

import android.content.Context;

import com.ufrpe.bsi.cadastrarconvidados.convidado.dominio.Convidado;
import com.ufrpe.bsi.cadastrarconvidados.convidado.persistencia.ConvidadoDAO;

import java.util.List;

public class ConvidadoServices {

    private ConvidadoDAO convidadoDAO;

    public ConvidadoServices(Context context) {
        this.convidadoDAO = new ConvidadoDAO(context);
    }

    public long cadastrarConvidado(Convidado convidado) {
        return convidadoDAO.cadastrar(convidado);
    }

    public List<Convidado> list() {
        return convidadoDAO.list();
    }



}
