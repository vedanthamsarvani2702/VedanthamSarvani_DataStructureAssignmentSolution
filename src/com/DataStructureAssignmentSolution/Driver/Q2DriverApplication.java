package com.DataStructureAssignmentSolution.Driver;



public class Q2DriverApplication {
	
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
			
		}
		
	}
	  static void inOrder(Node node) {
		    if (node == null)
		      return;

		    // traverse the left child
		    inOrder(node.left);

		    // traverse the root node
		    System.out.print(node.data  + " ");

		    // traverse the right child
		    inOrder(node.right);
		  }
	public static void main(String args[])
	{
		Node root=new Node(50);
		Node left=new Node(30);
		Node right=new Node(60);
		Node leftLeft=new Node(10);
	    Node rightLeft=new Node(55);
		
		
		root.left=left;
		root.right=right;
		left.left=leftLeft;
	    right.left=rightLeft;
	    
	    inOrder(root);
		
	}
}
