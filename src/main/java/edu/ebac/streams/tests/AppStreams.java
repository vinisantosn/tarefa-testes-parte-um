package edu.ebac.streams.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppStreams {
    public static void main(String[] args) {
        List<Pessoa> pessoasDoSexoFem = listaPessoasSexoFem();
        System.out.println("****** LISTA SEXO FEM ******");
        pessoasDoSexoFem.forEach(System.out::println);
    }

    public static List<Pessoa> listaPessoasSexoFem() {
        List<Pessoa> db = populaPessoas();
        List<Pessoa> pessoasDoSexoFeminino = db.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());
        return pessoasDoSexoFeminino;
    }

    public static List<Pessoa> populaPessoas(){
        List<Pessoa> pessoaList = new ArrayList<>();

        pessoaList.add(new Pessoa("Vinícius", "Masculino", 23));
        pessoaList.add(new Pessoa("Carolina Martins", "Feminino", 27));
        pessoaList.add(new Pessoa("Maria Silva", "Feminino", 30));
        pessoaList.add(new Pessoa("João Santos", "Masculino", 25));
        pessoaList.add(new Pessoa("Ana Oliveira", "Feminino", 40));
        pessoaList.add(new Pessoa("Pedro Almeida", "Masculino", 35));

        return pessoaList;
    }


}
