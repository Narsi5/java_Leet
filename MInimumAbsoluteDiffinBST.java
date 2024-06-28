public class MInimumAbsoluteDiffinBST {
    int diff = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return diff;
    }
    public void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.left);
        diff = Math.min(diff,Math.abs(root.val -prev));
        prev = root.val;
        helper(root.right);
    }
}
