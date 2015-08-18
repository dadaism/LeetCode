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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
	     ArrayList<Integer> a = new ArrayList<Integer>();
	     preorder(root, a);
	     return a;
	 }
	
	public void preorder(TreeNode root, ArrayList<Integer> a){
		if ( root==null) return;
		a.add(root.val);
		preorder(root.left, a);
		preorder(root.right, a);
	}
}
