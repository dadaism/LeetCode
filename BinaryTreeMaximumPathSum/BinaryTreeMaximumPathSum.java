/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    	int max;
	public int maxPathSum(TreeNode root) {
		max = (root==null) ? 0 : root.val;
		findMaxPathSum(root);
		return max;
	}
	
	public int findMaxPathSum(TreeNode root) {
		if (root==null)	return 0;
		int left = Math.max(findMaxPathSum(root.left),0);
		int right = Math.max(findMaxPathSum(root.right),0);
		max = Math.max(left+root.val+right, max);
		return Math.max(right,left)+root.val;
	}
}
