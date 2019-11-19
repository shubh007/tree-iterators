package io.tailf.design.treeiterator.binarytree;


import io.tailf.design.treeiterator.pojo.BinaryTreeNode;
import io.tailf.design.treeiterator.pojo.Data;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
    private BinaryTreeNode binaryTreeNode ;

    @Before
    public void createBinaryTree(){
        BinaryTree binaryTree = new BinaryTree();
        List<Data> dataList = new ArrayList<Data>();
        for(int i = 1 ; i <=7;i++) {
            dataList.add(new Data(i));
        }
        this.binaryTreeNode = binaryTree.createBinaryTree(dataList);
    }
    @Test
    public void traverseInorder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.traverseInorder(binaryTreeNode);
    }

    @Test
    public void traversePreOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.traversePreOrder(binaryTreeNode);
    }

    @Test
    public void traversePostOrder() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.traversePostOrder(binaryTreeNode);
    }
}