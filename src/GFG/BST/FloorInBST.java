package GFG.BST;

public class FloorInBST {
    class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
class Solution {
        int floor = -1;
        public int findMaxFork(Node root, int k) {
            if(root == null) return floor;
            if(root.data == k) return k;

            if(root.data < k){
                floor = root.data;
                return findMaxFork(root.right , k);
            }
            else{
                return findMaxFork(root.left , k);
            }
        }
    }

    public static void main(String[] args) {

    }
}
