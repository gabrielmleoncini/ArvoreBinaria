package br.com.s2it.controller;

import br.com.s2it.entity.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinaryTreeController {
    BinaryTree raizArvore = new BinaryTree();
    List<BinaryTree> arvore = new ArrayList<>();

    public List<BinaryTree> preencheArvoreBinaria() {
        raizArvore.setValor(10);

        inserirNo(5);


        inserirNo(15);


        return arvore;
    }

    public void inserirNo(int valor) {
        if (raizArvore == null) {
            raizArvore = new BinaryTree();
            raizArvore.setValor(valor);
        } else {
            BinaryTree novo = new BinaryTree();
            novo.setValor(valor);
            inserir(raizArvore, novo);
        }
    }

    private BinaryTree inserir(BinaryTree raiz, BinaryTree novoNo) {
        if (novoNo.getValor() > raiz.getValor()) {
            if (raiz.getRight() == null) {
                raiz.setRight(novoNo);
            } else {
                inserir(raiz.getRight(), novoNo);
            }
        } else {
            if (raiz.getLeft() == null) {
                raiz.setLeft(novoNo);
            } else {
                inserir(raiz.getLeft(), novoNo);
            }
        }
        arvore.add(raiz);
        return raiz;
    }

    public int somarNos(int valorNo) {
        int totalSoma = 0;

        List<BinaryTree> listNos = new ArrayList<>();
        Stream<BinaryTree> somaArvore = arvore.stream().filter(p -> p.getValor() == valorNo);
        listNos = somaArvore.collect(Collectors.toList());
        BinaryTree noLeft;
        BinaryTree noRight;

        boolean semNos = true;
        noRight = listNos.get(0).getRight();
        noLeft = listNos.get(0).getLeft();

        while (semNos) {
            if (listNos.get(0).getRight() != null || listNos.get(0).getLeft() != null) {

                if (noRight != null) {
                    totalSoma += noRight.getValor();
                    noRight = noRight.getRight();
                } else if (noLeft != null) {
                    totalSoma += noLeft.getValor();
                    noLeft = noLeft.getLeft();
                }
            } else {
                semNos = false;
            }

        }


        return totalSoma;
    }


}
