package javatest.treetraversal;

public class TestTree {
   private static class Node{
	   int key;
	   Node left;
	   Node right;
   }
   private static int addBT(Node node) {
	  if(node==null) {
		return 0;  
	  } else {
		  return node.key+addBT(node.left)+addBT(node.right);
	  }
   }
   private static Node addNewNode(int key) {
	   Node node=new Node();
	   node.key=key;
	   node.left=node.right=null;
	   return node;
   }
   public static void main(String[] args) {
	Node node=new Node();
	node.left=addNewNode(1);
	node.left.left=addNewNode(2);
	node.left.left.left=addNewNode(3);
	node.left.left.left.left=addNewNode(4);
	node.left.left.left.left.left=addNewNode(5);
	node.right=addNewNode(6);
	node.right.right=addNewNode(7);
	System.out.println(addBT(node));
}
}
