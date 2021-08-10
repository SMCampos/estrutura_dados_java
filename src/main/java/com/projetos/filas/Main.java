package com.projetos.filas;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);
        //[No{objeto=quarto}]--->[No{objeto=terceiro}]--->[No{objeto=segundo}]--->[No{objeto=primeiro}]--->null

        System.out.println((minhaFila.dequeue()));
        //primeiro

        System.out.println(minhaFila);
        //[No{objeto=quarto}]--->[No{objeto=terceiro}]--->[No{objeto=segundo}]--->null

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);
        //[No{objeto=ultimo}]--->[No{objeto=quarto}]--->[No{objeto=terceiro}]--->[No{objeto=segundo}]--->null

        System.out.println(minhaFila.first());
        //segundo

        System.out.println(minhaFila);
        //[No{objeto=ultimo}]--->[No{objeto=quarto}]--->[No{objeto=terceiro}]--->[No{objeto=segundo}]--->null
    }
}
