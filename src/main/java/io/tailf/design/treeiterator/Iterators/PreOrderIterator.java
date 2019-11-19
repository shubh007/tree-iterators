package io.tailf.design.treeiterator.Iterators;

import io.tailf.design.treeiterator.pojo.BinaryTreeNode;
import io.tailf.design.treeiterator.pojo.Data;
import java.util.Stack;

public class PreOrderIterator implements BinaryTreeIterator{

    private Stack<BinaryTreeNode> stack;

    public PreOrderIterator(BinaryTreeNode binaryTreeNode) {
        this.stack = new Stack<>();
        stack.push(binaryTreeNode);
    }
    private void pushRightLeft(BinaryTreeNode root){
        if(root!= null && root.getRight()!= null){
            this.stack.push(root.getRight());
        }
        if(root!= null && root.getLeft()!= null){
            this.stack.push(root.getLeft());
        }
    }
    public Data next() {
        BinaryTreeNode top = stack.pop();
        pushRightLeft(top);
        return top.getData();
    }

    public Boolean hasNext() {
        return stack.size()>0;
    }
}
