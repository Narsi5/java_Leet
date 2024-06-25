public class BinarySearchTreetoGreaterSumTree {
    public int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return root;
        }
        bstToGst(root.right);
        sum = sum +root.val;
        root.val =sum;
        bstToGst(root.left);
        return root;
    }
}
