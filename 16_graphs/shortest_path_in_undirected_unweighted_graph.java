//https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1



class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        ArrayList<LinkedList<Integer>> adj = new  ArrayList<LinkedList<Integer>>();
        for(int i=0;i<n;i++)
            adj.add(new LinkedList<Integer>());
        for(int[] e: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int level = 0, size, curr;
        int distance[] = new int[n];
        boolean visited[] = new boolean[n];
        Arrays.fill(distance, -1);
        Arrays.fill(visited, false);
        visited[src] = true;
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(src);
        
        while(!q.isEmpty()){
            for(size=q.size();size>0;size--){
                curr = q.poll();

                distance[curr] = level;
                
                for(Integer ne: adj.get(curr))
                    if(!visited[ne]){
                        visited[ne] = true;
                        q.add(ne);
                    }
            }
            level++;
        }
        return distance;
    }
}