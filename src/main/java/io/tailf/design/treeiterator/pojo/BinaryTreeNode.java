package io.tailf.design.treeiterator.pojo;

public class BinaryTreeNode {

    private BinaryTreeNode left;
    private BinaryTreeNode right;
    private Data data;

    public BinaryTreeNode() {

    }

    public BinaryTreeNode(Data data) {
        this.data = data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
            "left=" + left +
            ", right=" + right +
            ", data=" + data +
            '}';
    }
}
