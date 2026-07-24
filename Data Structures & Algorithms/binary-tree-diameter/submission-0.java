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
    int dia=-1;
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root,dia);
    }

   public int diameter(TreeNode root,int dia){
        if(root==null){
            return dia;
        }

        dia=Math.max(dia,height(root.left)+height(root.right));
        dia=diameter(root.left,dia);
        dia=diameter(root.right,dia);
        return dia;
   }

   public int height(TreeNode root){
     if(root==null){
        return 0;
     }
     return Math.max(height(root.left),height(root.right))+1;
   }
}
