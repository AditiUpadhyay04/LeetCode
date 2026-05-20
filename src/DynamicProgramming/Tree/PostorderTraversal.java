package DynamicProgramming.Tree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

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
        List<Integer> ans = new ArrayList<>();
        public void solve(TreeNode root){
            if(root == null) return;

            solve(root.left);
            solve(root.right);
            ans.add(root.val);
        }
        public List<Integer> postorderTraversal(TreeNode root) {
            solve(root);
            return ans;

        }
    }

    public static void main(String[] args) {

    }
}
/*
public List<Integer> postorderTraversal(TreeNode root) {

    List<Integer> ans = new ArrayList<>();
    Stack<TreeNode> st1 = new Stack<>();
    Stack<TreeNode> st2 = new Stack<>();

    if(root == null) return ans;

    st1.push(root);

    while(!st1.empty()){
        root = st1.pop();
        st2.push(root);

        if(root.left != null) st1.push(root.left);

        if(root.right != null) st1.push(root.right);
    }
    while(!st2.empty()){
        ans.add(st2.pop().val);
    }
    return ans;
  }
}

 */
