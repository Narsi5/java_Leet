import java.util.ArrayList;
import java.util.List;
class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calling preorderTraversal method
        List<Integer> preorderList = inorderTraversal(root);

        // Printing the result
        System.out.println("Preorder traversal: " + preorderList);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result);
        result.add(node.val); // Add the value to the result list
        inorder(node.right, result);
    }
        
}
