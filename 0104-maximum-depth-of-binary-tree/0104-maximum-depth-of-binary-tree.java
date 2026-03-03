class Solution {
    int max = 0;

    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return max;
    }

    private void dfs(TreeNode root, int depth) {
        if (root == null) return;

        depth++;

        if (root.left == null && root.right == null) {
            max = Math.max(max, depth);
        }

        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}