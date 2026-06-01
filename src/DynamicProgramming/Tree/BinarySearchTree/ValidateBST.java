package DynamicProgramming.Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode() {
          }

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
        List<Integer> ans = new ArrayList<>();
        public void solve(TreeNode root){
            if(root == null) return;

            solve(root.left);
            ans.add(root.val);
            solve(root.right);
        }
        public boolean isValidBST(TreeNode root) {
            solve(root);
            for(int i = 0; i < ans.size() - 1; i++){
                if(ans.get(i) >= ans.get(i + 1)) return false;


            }
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
