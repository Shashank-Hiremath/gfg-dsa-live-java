//https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1



//User function Template for Java


class Solution
{
    void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int i, Stack<Integer> st)
    {
        vis[i] = true;
        for(Integer ne: adj.get(i))
            if(!vis[ne])
                dfs(adj, vis, ne, st);
        st.add(i);
    }
    
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        
        int i, ans=0;
        boolean vis[] = new boolean[V];
        Arrays.fill(vis, false);
        Stack<Integer> st = new Stack<Integer>();
        for(i=0;i<V;i++)
            if(!vis[i])
                dfs(adj, vis, i, st);
        
        
        ArrayList<ArrayList<Integer>> rev = new ArrayList<ArrayList<Integer>>();
        for(i=0;i<V;i++)
            rev.add(new ArrayList<Integer>());
        for(i=0;i<V;i++)
            for(Integer ne: adj.get(i))
                rev.get(ne).add(i);
        
        Arrays.fill(vis, false);
        
        Stack<Integer> dummyStack = new Stack<Integer>();
        while(!st.isEmpty())
        {
            i = st.pop();
            if(!vis[i])
            {
                dfs(rev, vis, i, dummyStack);
                ans++;
            }
        }
        return ans;
    }
}