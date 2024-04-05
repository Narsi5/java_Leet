import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calling preorderTraversal method
        List<Integer> postorderList = postorderTraversal(root);

        // Printing the result
        System.out.println("Postorder traversal: " + postorderList);
    }
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private static void postorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postorder(node.left, result);
        result.add(node.val); // Add the value to the result list
        postorder(node.right, result);
    }
}
