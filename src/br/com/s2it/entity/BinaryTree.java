package br.com.s2it.entity;

public class BinaryTree {

    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree() {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public BinaryTree getRight() {
        return right;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "valor=" + valor +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
