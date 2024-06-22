import java.util.LinkedList;

public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();
        helper(root,list);
        TreeNode current = root;
        list.removeFirst();
        while (!list.isEmpty()) {
            current.right = new TreeNode(list.removeFirst());
            current.left = null;
            current = current.right;
        }
    }
    private void helper(TreeNode root, LinkedList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        helper(root.left, list);

        helper(root.right, list);
    }
}
