package com.kl.medium;

/**
 * 从前序与中序遍历序列构造二叉树
 * @author: kl
 * @date: 2023/5/26  16:52
 */
public class BuildTree {

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(buildTree(preorder,inorder));
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = new TreeNode();
        return node;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
