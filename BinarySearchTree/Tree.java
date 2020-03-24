import java.util.ArrayList;

public class Tree<E> implements BSTree<E>{
	
	// Attributes: the root node plus existence marker
	private Node<E> root;
	private boolean exists;
	
	// Constructors
	public Tree(Comparable key, E info){
		root = new Node<E>(key, info, new Tree<E>(), new Tree<E>());
		exists = true;
	}
	
	public Tree() {
		root = null;
		exists = true;
	}
	
	/* 
	 * Checks if the tree is empty.
	 * Returns true if it's empty, otherwise false.
	 */
	public boolean isEmpty() {
		return (root==null);
	}
	
	/*
	 * Returns the search key of the information stored in the root of the tree.
	 */
	public Comparable getKey() {
		if(isEmpty()) {
			return null;
		} else {
			return root.getKey();
		}
	}
	
	/*
	 * Returns the information stored in the root of the tree.
	 */
	public E getInfo() {
		if(isEmpty()) {
			return null;
		} else {
			return root.getInfo();
		}
	}
	
	/* 
	 * Returns the addresses of the roots of the left and right subtrees.
	 */
	public BSTree<E> getLeft() {
		if(isEmpty()) {
			return null;
		} else {
			return root.getLeft();
		}
	}
	
	public BSTree<E> getRight() {
		if(isEmpty()) {
			return null;
		} else {
			return root.getRight();
		}
	}
	
	/*
	 * Inserts information into the tree with a given key.
	 * If key already exists, the information will be overwritten.
	 */
	public void insert(Comparable key, E info) {
		if(isEmpty()) {
			root = new Node<E>(key, info, new Tree<E>(), new Tree<E>());
			exists = true;
		} else {
			if(root.getKey().compareTo(key) > 0) {
				getLeft().insert(key, info);
			} else if(root.getKey().compareTo(key) < 0) {
				getRight().insert(key, info);
			} else {
				root.setInfo(info);
				exists = true;
			}
		}
	}

	/*
	 * Searches for information that belongs to the given key and returns it.
	 */
	public E search(Comparable key) {
		if(isEmpty()) {
			return null;
		} else {
			if(root.getKey().compareTo(key) > 0) {
				return getLeft().search(key);
			} else if(root.getKey().compareTo(key) < 0) {
				return getRight().search(key);
			} else {
				if(exists) {
					return getInfo();
				} else {
					return null;
				}
			}
		}
	}

	/*
	 * Searches and extracts information that belongs to the given key and returns it.
	 */
	public E extract(Comparable key) {
		if(isEmpty()) {
			return null;
		} else {
			if(root.getKey().compareTo(key) > 0) {
				return getLeft().extract(key);
			} else if(root.getKey().compareTo(key) < 0) {
				return getRight().extract(key);
			} else {
				if(exists) {
					exists = false;
					return getInfo();
				} else {
					return null;
				}
			}
		}
	}
	
	/*
	 * Prints tree traversals.
	 */
	public String toStringPreOrder() {
		if(isEmpty()) {
			return "";
		} else {
			return (exists ? root.toString() + " " : "") +
			       getLeft().toStringPreOrder() +
				   getRight().toStringPreOrder();
		}
	}
	
	public String toStringInOrder() {
		if(isEmpty()) {
			return "";
		} else {
			return getLeft().toStringInOrder() +
				   (exists ? root.toString() + "; " : "") +
				   getRight().toStringInOrder();
		}
	}
	
	public String toStringPostOrder() {
		if(isEmpty()) {
			return "";
		} else {
			return getLeft().toStringPostOrder() +
				   getRight().toStringPostOrder() +
				   (exists ? root.toString() + " " : "");
		}
	}	
	
	/*
	 * Returns the size of the tree (the number of pieces of keys/information).
	 */
	public int size() {
		if(isEmpty()) {
			return 0;
		} else {
			return (exists ? 1 : 0) + getLeft().size() + getRight().size();
		}
	}

}