package DynamicProgramming.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
      class TreeNode {
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
        List<Integer> ans = new ArrayList<>();
        public void solve(TreeNode root){
            if(root == null) return;

            ans.add(root.val);
            solve(root.left);
            solve(root.right);
        }
        public List<Integer> preorderTraversal(TreeNode root) {
            solve(root);
            return ans;

        }
    }
    public static void main(String[] args) {

    }
}
/*
Using Stack
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        if(root == null) return ans;
        st.push(root);

        while(!st.empty()){
            root = st.pop();
            ans.add(root.val);
            if(root.right != null) st.push(root.right);
            if(root.left != null) st.push(root.left);

        }
        return ans;

    }
}

 */
