package DynamicProgramming.Tree;

public class DiameterOfBinaryTree {
    //543
    public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      class Solution {
        int maxx = 0;
        public int diameter(TreeNode root){

            if(root == null) return 0;
            int left = diameter(root.left);
            int right = diameter(root.right);
            maxx = Math.max(maxx , left + right);
            return 1 + Math.max(left , right);
        }
        public int diameterOfBinaryTree(TreeNode root) {
            diameter(root);
            return maxx;

        }
    }

    public static void main(String[] args) {

    }
}
