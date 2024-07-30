import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTree2 {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[][] dp = new List[n+1][n+1];
        return addBst(1,n,dp);
    }

    public List<TreeNode> addBst(int low,int high,List<TreeNode>[][] dp){
        if(low>high){
            List<TreeNode> list = new ArrayList<>();
            list.add(null);
            return list;
        }
        if(dp[low][high]!=null){
            return dp[low][high];
        }

        List<TreeNode> list = new ArrayList<>();
        for(int i = low;i<= high;i++){
            List<TreeNode> leftst = addBst(low,i-1,dp);
            List<TreeNode> rightst = addBst(i+1,high,dp);

            for(TreeNode left: leftst){
                for(TreeNode right: rightst){
                    list.add(new TreeNode(i,left,right));
                }
            }
        }
        return dp[low][high] = list;
    }
}
