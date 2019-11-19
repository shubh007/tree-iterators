package io.tailf.design.treeiterator.Iterators;

import io.tailf.design.treeiterator.pojo.BinaryTreeNode;
import io.tailf.design.treeiterator.pojo.Data;
import java.util.Stack;

public class InOrderIterator implements BinaryTreeIterator{

    private Stack<BinaryTreeNode> stack;

    public InOrderIterator(BinaryTreeNode root) {
        this.stack = new Stack<>();
        leftMost(root);

    }
    private void leftMost(BinaryTreeNode root){
        while(root!=null){
            this.stack.push(root);
            root = root.getLeft();
        }
    }
    public Data next() {
        BinaryTreeNode top = stack.pop();
        if(top.getRight()!=null){
            leftMost(top.getRight());
        }
        return top.getData();
    }
    public Boolean hasNext() {
        return stack.size()>0;
    }
}
