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
    public boolean isBalanced(TreeNode root) {
        boolean[] bl = {true};
        depth(root,bl);
        //System.out.println(bl[0]);
        return bl[0];
    }
    public static int depth(TreeNode root, boolean[] bl) {
        if (root==null) return 0;
        else {
            int depth_l = depth(root.left,bl);
            int depth_r = depth(root.right,bl);
            if (Math.abs(depth_l-depth_r)>1) bl[0]=false;
            //System.out.println("node.val="+root.val+"; depth_l="+depth_l+"; depth_r="+depth_r+"; bl="+bl[0]);
            return Math.max(depth_l, depth_r)+1;
        }
    }
}
