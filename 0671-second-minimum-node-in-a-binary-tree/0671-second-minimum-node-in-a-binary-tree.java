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
    HashSet<Integer> visited = new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        traversal(root);

        if (visited.size() < 2) return -1;

        ArrayList<Integer> list = new ArrayList<>(visited);
        Collections.sort(list);

        return list.get(1);
        
    }
    public void traversal(TreeNode root){
        if(root==null)return ;
        visited.add(root.val);
        traversal(root.left);
        traversal(root.right);
    }
}