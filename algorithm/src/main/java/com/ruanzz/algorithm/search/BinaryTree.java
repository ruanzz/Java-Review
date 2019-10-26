package com.ruanzz.algorithm.search;

/**
 * <p>二叉树</p>
 * 每个节点最多只有两个叶子节点的树
 *
 * @author ZhenZhuo.Ruan
 */
public class BinaryTree {

  private TreeNode root;

  public TreeNode getRoot() {
    return root;
  }

  public void setRoot(TreeNode root) {
    this.root = root;
  }

  private void frontTraverse() {
    System.out.println("##### 前序遍历 #####");
    if (this.root == null) {
      return;
    }
    this.root.frontTraverse();
    System.out.println();
  }

  private void midTraverse() {
    System.out.println("##### 中序遍历 #####");
    if (this.root == null) {
      return;
    }
    this.root.midTraverse();
    System.out.println();
  }

  private void afterTraverse() {
    System.out.println("##### 后续遍历 #####");
    if (this.root == null) {
      return;
    }
    this.root.afterTraverse();
    System.out.println();
  }

  private TreeNode frontSearch(int value) {
    System.out.println(String.format("$$$$$ 前序查找: %s $$$$$", value));
    TreeNode targetNode = this.root.frontSearch(value);
    if (targetNode != null) {
      System.out.println("找到了节点");
    } else {
      System.out.println("未找到节点");
    }
    return targetNode;
  }

  private void delete(int target) {
    System.out.println(String.format("&&&&& 删除元素: %s &&&&&", target));
    if (root.getValue() == target) {
      root = null;
    } else {
      root.delete(target);
    }

  }

  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    TreeNode root = new TreeNode(1);
    TreeNode leftNode = new TreeNode(2);
    TreeNode rightNode = new TreeNode(3);
    TreeNode leftLeftNode = new TreeNode(4);
    TreeNode leftRightNode = new TreeNode(5);
    root.setLeft(leftNode);
    root.setRight(rightNode);
    rightNode.setLeft(leftLeftNode);
    rightNode.setRight(leftRightNode);
    binaryTree.setRoot(root);
    binaryTree.frontTraverse();
    binaryTree.midTraverse();
    binaryTree.afterTraverse();
    binaryTree.frontSearch(5);
    binaryTree.delete(4);
    binaryTree.frontTraverse();
  }

}
