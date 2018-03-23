package br.com.s2it.core;

import br.com.s2it.controller.BinaryTreeController;
import br.com.s2it.entity.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        BinaryTreeController binaryTreeController = new BinaryTreeController();
        List<BinaryTree> arvore = new ArrayList<>();

        arvore = binaryTreeController.preencheArvoreBinaria();
        System.out.println(arvore.toString());

        System.out.println("Valor da Soma: " + binaryTreeController.somarNos(10));
    }
}
