public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left ==null && root.right == null) ){
            return root;
        }
        swap(root);
        return root;
    }
    public void swap(TreeNode root) {
        if(root == null) return ;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        swap(root.left);
        swap(root.right);
    }
}
