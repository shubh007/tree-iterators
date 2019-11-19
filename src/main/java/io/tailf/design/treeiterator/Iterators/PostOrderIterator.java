package io.tailf.design.treeiterator.Iterators;

import io.tailf.design.treeiterator.pojo.BinaryTreeNode;
import io.tailf.design.treeiterator.pojo.Data;
import java.util.Stack;

public class PostOrderIterator implements BinaryTreeIterator{

    private Stack<BinaryTreeNode> stack1;
    private Stack<BinaryTreeNode> stack2;
    public PostOrderIterator(BinaryTreeNode binaryTreeNode) {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
        stack1.push(binaryTreeNode);
        leftRight();
    }
    private void leftRight(){
        while(!stack1.empty()) {
            BinaryTreeNode root = stack1.pop();
            stack2.push(root);
            if (root.getLeft() != null) {
                this.stack1.push(root.getLeft());
            }
            if (root.getRight() != null) {
                this.stack1.push(root.getRight());
            }
        }
    }

    public Data next() {
        BinaryTreeNode top = stack2.pop();
        return top.getData();
    }

    public Boolean hasNext() {
        return stack2.size()>0;
    }
}
