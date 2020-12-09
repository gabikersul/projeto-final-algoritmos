package com.gabikersul.projetofinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Agenda {

    List<Contato> contatos = new ArrayList<>();

    public void adicionaContato(Contato contato){
        contatos.add(contato);
    }

    public void removeContato(Contato contato){
        Optional.ofNullable(contato).ifPresent(c -> this.contatos.remove(c));
    }

    public List<Contato> lista() {
        return contatos;
    }

    public Optional<Contato> buscaPorId(int id){
        Optional<Contato> contato;
        contato = contatos.stream().filter(c -> c.getId() == id).findAny();
        System.out.println((contato.isPresent()) ? contato.get().getNome() : "Contato não existe.");

        return contato;
    }

    public Optional<Contato> buscaPorNome(String nome){
        Optional<Contato> contato;
        contato = contatos.stream().filter(c -> c.getNome().equalsIgnoreCase(nome)).findAny();
        System.out.println((contato.isPresent()) ? contato.get().getNome() : "Contato não existe.");

        return contato;
    }
}
