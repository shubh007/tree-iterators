package io.tailf.design.treeiterator.factory;

import io.tailf.design.treeiterator.Iterators.BinaryTreeIterator;
import io.tailf.design.treeiterator.Iterators.InOrderIterator;
import io.tailf.design.treeiterator.Iterators.PostOrderIterator;
import io.tailf.design.treeiterator.Iterators.PreOrderIterator;
import io.tailf.design.treeiterator.constants.TreeIteratorType;
import io.tailf.design.treeiterator.pojo.BinaryTreeNode;

public class IteratorFactory {

    public static BinaryTreeIterator getIterator(BinaryTreeNode root){
        return new InOrderIterator(root);
    }

    public static BinaryTreeIterator getIterator(BinaryTreeNode root, TreeIteratorType treeIteratorType){
        if(TreeIteratorType.INORDER.equals(treeIteratorType)) {
            return new InOrderIterator(root);
        }else if(TreeIteratorType.POSTORDER.equals(treeIteratorType)) {
            return new PostOrderIterator(root);
        }else if(TreeIteratorType.PREORDER.equals(treeIteratorType)) {
            return new PreOrderIterator(root);
        }
        return null;
    }

}
