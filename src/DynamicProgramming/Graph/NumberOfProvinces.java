package DynamicProgramming.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {
        public void bfs(int id , int [] viss , ArrayList<ArrayList<Integer>> adj) {
            
            int v = adj.size();
            //boolean [] vis = new boolean[v];

            //ArrayList<Integer> list = new ArrayList<>();
            Queue<Integer> q = new LinkedList<>();

            viss[id] = 1;
            q.add(id);
            while(!q.isEmpty()){
                int curr = q.poll();
                //list.add(curr);

                int size = adj.get(curr).size();
                for(int i = 0; i < size; i++){
                    int ele = adj.get(curr).get(i);
                    if(viss[ele] == 0){
                        viss[ele] = 1;
                        q.add(ele);
                    }
                }
                // 0 1 2 3 4 5 6 7 8
                // for(int it : adj.get(curr)){
                //     if(vis[it] == false){
                //         vis[it] = true;
                //         q.add(it);
                //     }
                // }
            }
        }
        //return list;
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for(int i = 0; i < n; i++){
                adj.add(new ArrayList<>());
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(isConnected[i][j] == 1){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }

            int [] viss = new int[n];

            int count = 0;

            for(int i = 0; i < n; i++){
                if(viss[i] == 0){
                    viss[i] = 1;
                    count++;
                    bfs(i,viss,adj);
                }

            }
            return count;

        }

    public static void main(String[] args) {

    }
}

