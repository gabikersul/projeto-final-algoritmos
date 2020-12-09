package com.gabikersul.projetofinal;

public class Contato {

    private String nome;
    private String numero;
    private int id;

    public Contato(String nomeContato, String numeroContato, int idContato){
        this.nome = nomeContato;
        this.numero = numeroContato;
        this.id = idContato;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public int getId() {
        return id;
    }

}

