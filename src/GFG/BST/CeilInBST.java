package GFG.BST;

public class CeilInBST {
    class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
}

    class Solution {
        int ceil = -1;
        int findCeil(Node root, int x) {

            if(root == null) return ceil;
            if(root. data == x) return x;

            if(root.data > x){
                ceil = root.data;
                return findCeil(root.left , x);
            }
            else{
                return findCeil(root.right , x);
            }

        }
    }

    public static void main(String[] args) {

    }
}
