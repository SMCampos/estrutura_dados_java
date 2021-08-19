package com.projetos.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);
        //[No{conteudo=c0}]--->(Retorna ao início)

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        //[]

        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);
        //[No{conteudo=c3}]--->[No{conteudo=c2}]--->[No{conteudo=c1}]--->(Retorna ao início)

        System.out.println(minhaListaCircular.get(0));
        //c3
        System.out.println(minhaListaCircular.get(1));
        //c2
        System.out.println(minhaListaCircular.get(2));
        //c1
        System.out.println(minhaListaCircular.get(3));
        //c3
    }
}
