package com.ruanzz.algorithm.search;

/**
 * <p>树的节点</p>
 *
 * @author ZhenZhuo.Ruan
 */
public class TreeNode {

  /**
   * 节点的权
   */
  private int value;

  /**
   * 左子节点
   */
  private TreeNode left;

  /**
   * 右子节点
   */
  private TreeNode right;

  public TreeNode(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public TreeNode getLeft() {
    return left;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  /**
   * 前序遍历
   */
  public void frontTraverse() {
    // 当前节点
    System.out.print(value + " ");
    // 左子节点
    if (this.left != null) {
      this.left.frontTraverse();
    }
    // 右子节点
    if (this.right != null) {
      this.right.frontTraverse();
    }

  }

  public void midTraverse() {
    // 左子节点
    if (this.left != null) {
      this.left.frontTraverse();
    }
    // 当前节点
    System.out.print(value + " ");
    // 右子节点
    if (this.right != null) {
      this.right.frontTraverse();
    }
  }

  public void afterTraverse() {
    // 左子节点
    if (this.left != null) {
      this.left.frontTraverse();
    }
    // 右子节点
    if (this.right != null) {
      this.right.frontTraverse();
    }
    // 当前节点
    System.out.print(value + " ");
  }

  public TreeNode frontSearch(int value) {
    if (this.value == value) {
      return this;
    }
    TreeNode targetNode = null;
    // 搜索左子树
    if (this.left != null) {
      targetNode = this.left.frontSearch(value);
      if (targetNode == null && this.right != null) {
        // 搜索右子树
        return this.right.frontSearch(value);
      }
    } else if (this.right != null) {
      return this.right.frontSearch(value);
    }
    return targetNode;
  }

  /**
   * 删除子树
   */
  public void delete(int target) {
    TreeNode parent = this;
    if (parent.left != null
        && parent.left.value == target) {
      parent.left = null;
      return;
    }

    if (parent.right != null
        && parent.right.value == target) {
      parent.right = null;
      return;
    }

    // 递归
    parent = left;
    if (parent != null) {
      parent.delete(target);
    }

    parent = right;
    if (parent != null) {
      parent.delete(target);
    }

  }
}
