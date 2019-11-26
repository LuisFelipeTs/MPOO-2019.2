package com.ufrpe.bsi.cadastrarconvidados.infra.persistencia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final int VERSAO_BANCO = 1;
    public static final String NOME_BANCO = "SORESENHA_BD";

    public static final String TABELA_CONVIDADOS = "TB_CONVIDADOS";
    public static final String COLUNA_ID = "ID";
    public static final String COLUNA_NOME = "NOME";
    public static final String COLUNA_IDADE = "IDADE";

    private static final String[] TABELAS = {
            TABELA_CONVIDADOS
    };

    public DBHelper(Context context) {
        super(context, DBHelper.NOME_BANCO , null, DBHelper.VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        criarTabelaConvidados(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("DB Upgrade", "Upgrading DB from "+oldVersion+" to " +newVersion);
        dropTables(db);
        onCreate(db);
    }

    private void criarTabelaConvidados(SQLiteDatabase db) {
        String QUERY_COLUNAUSUARIO = "CREATE TABLE " + TABELA_CONVIDADOS + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY, "
                + COLUNA_NOME + " TEXT, "
                + COLUNA_IDADE + " TEXT)";
        db.execSQL(QUERY_COLUNAUSUARIO);
    }

    private void dropTables(SQLiteDatabase db) {
        for (String tabela : TABELAS) {
            db.execSQL("DROP TABLE IF EXISTS " + tabela + ";");
        }
    }

}
