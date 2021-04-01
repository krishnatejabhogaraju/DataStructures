package com.datastructure.trees;

public class BinaryTree<T extends Comparable<T>> {

	public void inOrderTraversal(Node<?> node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		System.out.println(" " + node.data);
		inOrderTraversal(node.right);
	}

	private boolean contains(Node<T> node, T data) {
		if (node == null)
			return false;
		int cmp = data.compareTo((T) node.data);
		if (cmp < 0) {
			return contains(node.left, data);
		}
		if (cmp > 0) {
			return contains(node.right, data);
		}
		return true;
	}

	public boolean add(Node<T> node, T data) {
		if (contains(node, data)) {
			return false;
		} else {
			node = addNode(node, data);
			return true;
		}
	}

	private Node<T> addNode(Node<T> node, T data) {

		if (node == null) {
			node = new Node<T>(data);
			return node;
		} else {

			if (data.compareTo((T) node.data) < 0) {
				node.left = addNode(node.left, data);
			} else {
				node.right = addNode(node.right, data);
			}
		}
		return node;
	}
}
