package com.datastructure.trees;

public class TreeTesting {

	public static void main(String[] args) {

		BinaryTree<Integer> tree = new BinaryTree<Integer>();
		Node<Integer> node = new Node<Integer>(10);
		tree.add(node, 11);
		tree.add(node, 15);
		tree.add(node, 6);
		tree.inOrderTraversal(node);

	}

}
