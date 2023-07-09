package com.kl.tree.BinaryTree;

/**
 * 普通二叉树 -测试
 * @author: kl
 * @date: 2023/5/8  11:17
 */
public class BinaryTreeDemo {

    public static void main(String[] args) {
        //先需要创建一颗二叉树
        BinaryTree binaryTree=new BinaryTree();
        //创建需要的结点
        BinaryNode root=new BinaryNode(1,"宋江");
        BinaryNode node2=new BinaryNode(2,"吴用");
        BinaryNode node3=new BinaryNode(3,"卢俊义");
        BinaryNode node4=new BinaryNode(4,"林冲");
        BinaryNode node5=new BinaryNode(5,"武松");
        BinaryNode node6=new BinaryNode(6,"鲁智 深");
        BinaryNode node7=new BinaryNode(7,"杨志");

        //说明，我们先手动创建该二叉树，后面我们学习递归的方式创建而常数
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        binaryTree.setRoot(root);

        //测试：
        System.out.println("前序遍历");//1,2,4,5,3,6,7
        binaryTree.preOrder();

        System.out.println("中序遍历");//4,2,5,1,6,3,7
        binaryTree.infixOrder();
        System.out.println("后序遍历");//4,5,2,6,7,3,1
        binaryTree.postOrder();

    }


}
