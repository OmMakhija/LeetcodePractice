class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return traversal(root);
    }

    public int traversal(TreeNode root){
        if(root == null) return 0;

        int sum = 0;

        if(root.left != null && root.left.left == null && root.left.right == null){
            sum += root.left.val;
        }

        sum += traversal(root.left);
        sum += traversal(root.right);

        return sum;
    }
}