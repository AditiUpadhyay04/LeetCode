package GFG.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_in_Graph {
        public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
            
            int v = adj.size();
            boolean[] visited = new boolean[v];

            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();

            visited[0] = true;
            q.add(0);

            while(!q.isEmpty()){
                int curr = q.poll();
                ans.add(curr);

                for(int i : adj.get(curr)){
                    if(visited[i] == false){
                        visited[i] = true;
                        q.add(i);
                    }
                }
            }
            return ans;
        }

    public static void main(String[] args) {

    }
}

