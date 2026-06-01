package DynamicProgramming.Tree.BinarySearchTree;

public class DeleteNodeInBST {
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
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root == null) return root;
            if(root.val == key) return solve(root);

            TreeNode temp = root;
            while(root != null){
                if(root.val > key){
                    //exploring left subtree
                    if(root.left != null && root.left.val == key){
                        root.left = solve(root.left);
                    }
                    else{
                        root = root.left;
                    }
                }
                else{
                    //exploring right subtree
                    if(root.right != null && root.right.val == key){
                        root.right = solve(root.right);
                    }
                    else{
                        root = root.right;
                    }
                }
            }
            return temp;

        }
        public TreeNode solve(TreeNode root){
            if(root.left == null) return root.right;//if;eft child doesnot exit
            else if(root.right == null) return root.left;// if right doesnot exits

            TreeNode rightChild = root.right;
            TreeNode leftChild = asRightAsPossible(root.left);
            leftChild.right = rightChild;
            return root.left;
        }
        public TreeNode asRightAsPossible(TreeNode root){
            if(root.right == null) return root;
            return asRightAsPossible(root.right);

        }
    }

    public static void main(String[] args) {

    }
}
