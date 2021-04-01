package com.datastructure.trees;

public class Node<T> {
	T data;
	Node<T> left;
	Node<T> right;

	Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	Node(T data, Node<T> left, Node<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
