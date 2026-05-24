package DynamicProgramming.Tree;

public class BInaryTreeMaximumPathSum {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
         TreeNode(int val) {
          this.val = val;
     }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
     
    class Solution {
        int maxx = 0;
        public int Path(TreeNode root){
            if(root == null) return 0;

            int left = Math.max(Path(root.left) , 0);
            int right = Math.max(Path(root.right) , 0);
            maxx = Math.max(maxx , root.val + left + right);
            return root.val + Math.max(left , right);
        }
        public int maxPathSum(TreeNode root) {
            Path(root);
            return maxx;
        }
    }
}
