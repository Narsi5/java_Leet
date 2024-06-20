import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
    public void helper(TreeNode root, List<Integer> ans,int depth){
        if(root == null){
            return ;
        }
        if(depth == ans.size()){
            ans.add(root.val);
        }

        helper(root.right,ans,depth+1);
        helper(root.left,ans,depth+1);

    }
}
