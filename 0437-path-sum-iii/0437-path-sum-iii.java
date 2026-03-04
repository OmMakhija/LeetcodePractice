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
    int ans = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        
        traverse(root, targetSum,0);
        if(root.left!=null)
        pathSum(root.left, targetSum);
        if(root.right!=null)
        pathSum(root.right, targetSum);
        return ans;
    }
    public void traverse(TreeNode root, int targetSum,long sum){
        if(root==null)return ;
        
        sum=sum+root.val;
        if(sum==targetSum){
            ans++;
        }
        
        traverse(root.left,targetSum,sum);
        traverse(root.right,targetSum,sum);


    }
}