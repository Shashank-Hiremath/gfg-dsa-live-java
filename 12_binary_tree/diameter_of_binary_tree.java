//https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

class Solution {
    int ma;
    int height(Node curr)
    {
        if(curr == null)
            return 0;
        int left = height(curr.left);
        int right = height(curr.right);
        int diameter = left + right + 1;
        ma = Math.max(ma, diameter);
        return 1 + Math.max(left, right);
    }
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        ma = 0;
        height(root);
        return ma;
    }
}