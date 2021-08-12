package com.projetos.listaduplaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplaEncadeada<String> minhaListaEncadeada = new ListaDuplaEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println(minhaListaEncadeada);
        //[No{conteudo=c1}]--->[No{conteudo=c2}]--->[No{conteudo=c3}]--->
        // [No{conteudo=c4}]--->[No{conteudo=c5}]--->[No{conteudo=c6}]--->[No{conteudo=c7}]--->null

        minhaListaEncadeada.remove(3);
        minhaListaEncadeada.add(3, "99");

        System.out.println(minhaListaEncadeada);
        //[No{conteudo=c1}]--->[No{conteudo=c2}]--->[No{conteudo=c3}]--->[No{conteudo=99}]--->
        //[No{conteudo=c5}]--->[No{conteudo=c6}]--->[No{conteudo=c7}]--->null
    }
}
