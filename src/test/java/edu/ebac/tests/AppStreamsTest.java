package edu.ebac.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static edu.ebac.streams.tests.AppStreams.listaPessoasSexoFem;


class AppStreamsTest {
    @Test
    public void testaListaDeSexoFeminino (){
        Assertions.assertTrue(listaPessoasSexoFem()
                .stream()
                .allMatch(pessoa -> pessoa.getSexo().equalsIgnoreCase("Feminino")));
    }

}