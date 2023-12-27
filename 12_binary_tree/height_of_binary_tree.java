//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1



//User function Template for Java

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */


class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node == null)
            return 0;
        
        // int left = height(node.left);
        // int right = height(node.right);
        // return 1 + Math.max(left, right);
        
        //return 1 + Math.max(height(node.left), height(node.right));
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node curr = node;
        int height = 0, size;
        while(node != null && !q.isEmpty())
        {
            for(size=q.size();size>0;size--)
            {
                curr = q.remove();
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            height++;
        }
        return height;
    }
}