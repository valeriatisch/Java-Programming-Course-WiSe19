/*
 * Help: https://visualgo.net/en/bst
 * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 */

 public class Application {

	public static void main(String args[]) {
		
		// Create a tree.
		BSTree<Integer> tree = new Tree();
		
		// Insert 10 nodes.
		tree.insert("Maria", 1998);
		tree.insert("Alex", 2000);
		tree.insert("Emma", 1995);
		tree.insert("Elias", 2001);
		tree.insert("Anna", 2002);
		tree.insert("Felix", 1996);
		tree.insert("Mia", 1993);
		tree.insert("Leon", 2003);
		tree.insert("Rita", 1997);
		tree.insert("Paul", 1992);
				
		// Print different traversals of the tree.
		System.out.println("IN-ORDER: " + tree.toStringInOrder());
		System.out.println("PRE-ORDER: " + tree.toStringPreOrder());
		System.out.println("POST-ORDER: " + tree.toStringPostOrder());
		
		// Print the tree size.
		System.out.println("Number of nodes = " + tree.size());
		
		// Delete two nodes from the tree.
		System.out.println("Deleted Maria: " + tree.extract("Maria"));
		System.out.println("Deleted Leon: " + tree.extract("Leon"));
		
		// Print the inorder traversal of it again and see how the size has changed.
		System.out.println("INORDER: " + tree.toStringInOrder());
		System.out.println("Number of nodes = " + tree.size());		
		
	}

}
