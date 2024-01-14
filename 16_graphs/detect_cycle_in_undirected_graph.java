//https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1



class Solution {
    
    boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int i, int parent)
    {
        vis[i] = true;
        for(Integer ne: adj.get(i))
            if(!vis[ne])
            {
                if(dfs(adj, vis, ne, i))
                    return true;
            }
            else if(ne != parent)
                return true;
        return false;
    }
    
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        for(int i=0;i<V;i++)
            if(!vis[i] && dfs(adj, vis, i, -1))
                return true;
        return false;
    }
}