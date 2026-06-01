package GFG.BST;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessorInBST {
    class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}


    class Solution {
        List<Integer> ans = new ArrayList<>();
        public void solve(Node root){
            if(root == null) return;

            solve(root.left);
            ans.add(root.data);
            solve(root.right);


        }
        public int inOrderSuccessor(Node root, Node k) {
            solve(root);

            for(int i = 0; i < ans.size() - 1; i++){
                if(ans.get(i) == k.data) return ans.get(i + 1);
            }
            return -1;

        }
    }

    public static void main(String[] args) {
        
    }
}
