package com.ufrpe.bsi.cadastrarconvidados.convidado.persistencia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.ufrpe.bsi.cadastrarconvidados.convidado.dominio.Convidado;
import com.ufrpe.bsi.cadastrarconvidados.infra.persistencia.DBHelper;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConvidadoDAO {

    private DBHelper dbHelper;
    public ConvidadoDAO(Context context) {
        this.dbHelper = new DBHelper(context);
    }

    public long cadastrar(Convidado convidado){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUNA_NOME, convidado.getNome());
        values.put(DBHelper.COLUNA_IDADE, convidado.getIdade());
        long res = db.insert(DBHelper.TABELA_CONVIDADOS, null, values);
        db.close();
        return res;
    }

    public List<Convidado> list() {
        ArrayList<Convidado> eventoList = new ArrayList<>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String sql = "SELECT * FROM " + DBHelper.TABELA_CONVIDADOS;
        Cursor cursor = db.rawQuery(sql, new String[]{});
        while (cursor.moveToNext()) {
            eventoList.add(createConvidado(cursor));
        }
        cursor.close();
        db.close();
        return eventoList;
    }

    private Convidado createConvidado(Cursor cursor) {
        Convidado convidado = new Convidado();
        convidado.setNome(cursor.getString(cursor.getColumnIndex(DBHelper.COLUNA_NOME)));
        convidado.setId(cursor.getLong(cursor.getColumnIndex(DBHelper.COLUNA_ID)));
        convidado.setIdade(cursor.getString(cursor.getColumnIndex(DBHelper.COLUNA_IDADE)));
        return convidado;
    }

}
