package com.ufrpe.bsi.cadastrarconvidados.convidado.dominio;

public class Convidado {
    private long id;
    private String nome;
    private String idade;

    public Convidado(){}

    public Convidado(long id){
        this.id = id;
    }

    public Convidado(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
}
