public interface BSTree<E> {
	
	/* 
	 * Checks if the tree is empty.
	 * Returns true if it's empty, otherwise false.
	 */
	boolean isEmpty();
	
	/*
	 * Returns the search key of the information stored in the root of the tree.
	 */
	Comparable getKey();
	
	/*
	 * Returns the information stored in the root of the tree.
	 */
	E getInfo();
	
	/* 
	 * Returns the addresses of the roots of the left and right subtrees.
	 */
	BSTree<E> getLeft();
	BSTree<E> getRight();
	
	/*
	 * Inserts information into the tree with a given key.
	 * If key already exists, the information will be overwritten.
	 */
	void insert(Comparable key, E info);
	
	/*
	 * Searches for information that belongs to the given key and returns it.
	 */
	E search(Comparable key);
	
	/*
	 * Searches and extracts information that belongs to the given key and returns it.
	 */
	E extract(Comparable key);
	
	/*
	 * Prints tree traversals.
	 */
	String toStringPreOrder();
	String toStringInOrder();
	String toStringPostOrder();
	
	/*
	 * Returns the size of the tree (the number of pieces of keys/information).
	 */
	int size();	
}