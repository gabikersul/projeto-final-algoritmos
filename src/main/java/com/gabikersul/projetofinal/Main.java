package com.gabikersul.projetofinal;

public class Main {

    public static void main(String[] args){
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Gabriela", "988278232", 1);
        Contato contato2 = new Contato("Lucas", "988278233", 2);
        Contato contato3 = new Contato("Alethea", "988278234", 3);

        agenda.adicionaContato(contato1);
        agenda.adicionaContato(contato2);
        agenda.adicionaContato(contato3);

        agenda.lista().forEach(c -> System.out.println(c.getNome()));

        agenda.buscaPorNome("GABRIELA");
        agenda.buscaPorNome("Caetano");

        agenda.removeContato(null);

    }
}


