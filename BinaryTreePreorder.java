import java.util.ArrayList;
import java.util.List;
public class BinaryTreePreorder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calling preorderTraversal method
        List<Integer> preorderList = preorderTraversal(root);

        // Printing the result
        System.out.println("Preorder traversal: " + preorderList);
    }
    public static List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private static void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorder(node.left, result);

        preorder(node.right, result);
    }
}
