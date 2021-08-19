package com.projetos.javaestruturas.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        //true
        System.out.println(queueCarros);
        //[Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}]

        System.out.println(queueCarros.offer(new Carro("Renault")));
        //true
        System.out.println(queueCarros);
        //[Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}, Carro{marca='Renault'}]

        System.out.println(queueCarros.peek());
        //Carro{marca='Ford'}
        System.out.println(queueCarros);
        //[Carro{marca='Ford'}, Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}, Carro{marca='Renault'}]

        System.out.println(queueCarros.poll());
        //Carro{marca='Ford'}
        System.out.println(queueCarros);
        //[Carro{marca='Chevrolet'}, Carro{marca='Fiat'}, Carro{marca='Peugeot'}, Carro{marca='Renault'}]

        System.out.println(queueCarros.isEmpty());
        //false

        System.out.println(queueCarros.size());
        //4
    }
}
