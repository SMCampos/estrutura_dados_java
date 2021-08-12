package com.projetos.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
        minhaListaEncadeada.add("Teste1");
        minhaListaEncadeada.add("Teste2");
        minhaListaEncadeada.add("Teste3");
        minhaListaEncadeada.add("Teste4");
        System.out.println(minhaListaEncadeada.get(0)); //Teste1
        System.out.println(minhaListaEncadeada.get(1)); //Teste2
        System.out.println(minhaListaEncadeada.get(2)); //Teste3
        System.out.println(minhaListaEncadeada.get(3)); //Teste4

        System.out.println(minhaListaEncadeada);
        //[No{conteudo=Teste1}--->[No{conteudo=Teste2}--->[No{conteudo=Teste3}--->[No{conteudo=Teste4}--->null

        System.out.println(minhaListaEncadeada.remove(3));
        //Teste4

        System.out.println(minhaListaEncadeada);
        //[No{conteudo=Teste1}--->[No{conteudo=Teste2}--->[No{conteudo=Teste3}--->null
    }
}
