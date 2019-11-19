package io.tailf.design.treeiterator.binarytree;

import io.tailf.design.treeiterator.Iterators.BinaryTreeIterator;
import io.tailf.design.treeiterator.constants.TreeIteratorType;
import io.tailf.design.treeiterator.factory.IteratorFactory;
import io.tailf.design.treeiterator.pojo.BinaryTreeNode;
import io.tailf.design.treeiterator.pojo.Data;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    public BinaryTreeNode createBinaryTree(List<Data> dataList){
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode troot = null;
        BinaryTreeNode root = null;
        for(Data data:dataList){
            if(troot == null){
                troot = new BinaryTreeNode(data);
                root = troot;
            }else if(troot.getLeft() == null){
                troot.setLeft(new BinaryTreeNode(data));
                queue.add(troot.getLeft());
            }else if(troot.getRight() == null){
                troot.setRight(new BinaryTreeNode(data));
                queue.add(troot.getRight());
            }
            if(troot.getLeft()!=null && troot.getRight()!=null && !queue.isEmpty()){
                troot = queue.poll();
            }
        }
        return root;
    }

    public void traverseInorder(BinaryTreeNode root){
        if(root == null){
            System.out.print("Nothing To Print");
            return;
        }
        BinaryTreeIterator binaryTreeIterator = IteratorFactory.getIterator(root);
        while (binaryTreeIterator.hasNext()){
            System.out.print(binaryTreeIterator.next()+" , ");
        }
    }

    public void traversePreOrder(BinaryTreeNode root){
        if(root == null){
            System.out.print("Nothing To Print");
            return;
        }
        BinaryTreeIterator binaryTreeIterator = IteratorFactory.getIterator(root, TreeIteratorType.PREORDER);
        while (binaryTreeIterator.hasNext()){
            System.out.print(binaryTreeIterator.next()+" , ");
        }
    }

    public void traversePostOrder(BinaryTreeNode root){
        if(root == null){
            System.out.print("Nothing To Print");
            return;
        }
        BinaryTreeIterator binaryTreeIterator = IteratorFactory.getIterator(root, TreeIteratorType.POSTORDER);
        while (binaryTreeIterator.hasNext()){
            System.out.print(binaryTreeIterator.next()+" , ");
        }
    }

}
