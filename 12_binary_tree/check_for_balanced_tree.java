//https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1

/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    int f(Node curr)
    {
        if(curr == null)
            return 0;
        int left = f(curr.left);
        int right = f(curr.right);
        if(left == -1 || right == -1 || Math.abs(left-right)>1)
            return -1;
        return 1+Math.max(left, right);
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        return f(root) != -1;
    }
}