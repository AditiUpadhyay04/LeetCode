package DynamicProgramming.Tree;
import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

class Binary_Tree_Inorder_Traversal{
          int val;
          TreeNode left;
          TreeNode right;
    Binary_Tree_Inorder_Traversal() {}
    Binary_Tree_Inorder_Traversal(int val) {
              this.val = val;
          }
    Binary_Tree_Inorder_Traversal(int val, TreeNode left, TreeNode right) {
            this.val = val;
              this.left = left;
             this.right = right;
         }

    List<Integer> ans = new ArrayList<>();
        public void solve(TreeNode root){
            if(root == null) return;

//            solve(root.left);
//            ans.add(root.val);
//            solve(root.right);
        }
     public List<Integer> inorderTraversal(TreeNode root) {
            solve(root);
            return ans;

        }

    public static void main(String[] args) {

    }
}

