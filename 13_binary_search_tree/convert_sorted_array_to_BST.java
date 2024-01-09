//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode convertToBST(int[] nums, int lo, int hi){
        if(lo>hi)
            return null;
        if(lo == hi)
            return new TreeNode(nums[lo]);
        int mid = lo + (hi-lo)/2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = convertToBST(nums, lo, mid-1);
        curr.right = convertToBST(nums, mid+1, hi);
        return curr;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        return convertToBST(nums, 0, n-1);
    }
}