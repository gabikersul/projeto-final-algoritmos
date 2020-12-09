package com.gabikersul.projetofinal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class AgendaTest {

    private Agenda agenda = new Agenda();
    private Contato contato1 = new Contato("Gabriela", "988278232", 1);
    private Contato contato2 = new Contato("Lucas", "988278233", 2);
    private Contato contato3 = new Contato("Alethea", "9825621",3);

    @Before
    public void iniciaAgenda(){
        agenda.adicionaContato(contato1);
        agenda.adicionaContato(contato2);
    }

    @Test
    public void testeAdicionaContato(){
        agenda.adicionaContato(contato3);
        Assert.assertEquals(3,agenda.lista().size());
        Assert.assertEquals("Alethea", agenda.lista().get(2).getNome());
        Assert.assertEquals(3, agenda.lista().get(2).getId());
        Assert.assertEquals("9825621", agenda.lista().get(2).getNumero());
    }

    @Test
    public void testeRemoveContato(){
        agenda.adicionaContato(contato3);
        agenda.removeContato(contato3);
        Assert.assertEquals(2,agenda.lista().size());
        Optional<Contato> contatoRemovido = agenda.buscaPorId(3);
        Assert.assertFalse(contatoRemovido.isPresent());
    }

    @Test
    public void testeTamanhoDaListaDeContatos(){
        Contato contato4 = new Contato("Thais", "988278243", 4);
        Contato contato5 = new Contato("Eduarda", "98256231",5);
        agenda.adicionaContato(contato3);
        agenda.adicionaContato(contato4);
        agenda.adicionaContato(contato5);
        Assert.assertEquals(5,agenda.lista().size());
    }

    @Test
    public void testeBuscaPorNome(){
        Assert.assertEquals(contato1, agenda.buscaPorNome("gabriela").get());
        Assert.assertEquals(contato1, agenda.buscaPorNome("GABRIELA").get());
        Assert.assertEquals(contato1, agenda.buscaPorNome("Gabriela").get());
    }

    @Test
    public void testeBuscaPorID(){
        Assert.assertEquals(contato2, agenda.buscaPorId(2).get());
        Assert.assertTrue(agenda.buscaPorId(2).isPresent());
        Assert.assertFalse(agenda.buscaPorId(6).isPresent());
    }
}

