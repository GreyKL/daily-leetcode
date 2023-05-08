package com.kl.tree.BinaryTree;

/**
 * 二叉树
 * @author: kl
 * @date: 2023/5/8  11:21
 */
public class BinaryTree {
    private BinaryNode root;//根节点

    public void setRoot(BinaryNode root){
        this.root=root;
    }
    //前序遍历
    public void preOrder(){
        if(this.root!=null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //后序遍历
    public void infixOrder(){
        if(this.root!=null){
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //后序遍历
    public void postOrder(){
        if(this.root!=null){
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
}
