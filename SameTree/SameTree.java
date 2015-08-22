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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if ( p==null && q==null )	return true;
        else if ( p==null && q!=null ) return false;
        else if ( p!=null && q==null ) return false;
        else if ( p.val != q.val )	return false;
        else
        	return ( isSameTree(p.left, q.left) && isSameTree(p.right, q.right) );
    }
}
