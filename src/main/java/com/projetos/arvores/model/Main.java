package com.projetos.arvores.model;

import com.projetos.arvores.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        minhaArvore.exibirInOrdem();
        //Exibindo inOrdem
        //2, 10, 12, 13, 20, 25, 29, 31,
        minhaArvore.exibirPreOrdem();
        //Exibindo PreOrdem
        //13, 10, 2, 12, 25, 20, 31, 29,
        minhaArvore.exibirPosOrdem();
        //Exibindo PosOrdem
        //2, 12, 10, 20, 29, 31, 25, 13,

    }
}
