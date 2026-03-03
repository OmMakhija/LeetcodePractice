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
    ArrayList<Integer> traversal = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        ArrayList<Integer> unsorted = new ArrayList<>(traversal);
        Collections.sort(traversal);
        for(int i=1;i<traversal.size();i++){
            if(traversal.get(i)<=unsorted.get(i-1)){
                return false;
            }
        }
        return true;
    }
    public void traverse(TreeNode root){
        if(root == null) return;
        traverse(root.left);
        traversal.add(root.val);
        traverse(root.right);
    }
}