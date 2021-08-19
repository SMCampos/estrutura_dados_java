package com.projetos.javaestruturas.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Sandro");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3A");

        System.out.println(aluno);
        //{Turma=3A, Idade=17, Media=8.5, Nome=Sandro}
        System.out.println(aluno.keySet());
        //[Turma, Idade, Media, Nome]
        System.out.println(aluno.values());
        //[3A, 17, 8.5, Sandro]

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Marcos");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3B");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);
        //[{Turma=3A, Idade=17, Media=8.5, Nome=Sandro}, {Turma=3B, Idade=18, Media=8.9, Nome=Marcos}]

    }
}
