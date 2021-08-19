package com.projetos.javaestruturas.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("VolksWagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        //true
        System.out.println(new Carro("Ford").hashCode());
        //2195706
        System.out.println(new Carro("Ford").hashCode());
        //2195706
        System.out.println(new Carro("Ford1").hashCode());
        //68066005

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
        //false
    }
}
