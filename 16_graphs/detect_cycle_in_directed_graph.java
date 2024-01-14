//https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1



/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        int indegree[] = new int[V];
        Arrays.fill(indegree, 0);
        int i, curr, cnt=0;
        
        for(i=0;i<V;i++)
            for(Integer ne: adj.get(i))
                indegree[ne]++;
        for(i=0;i<V;i++)
            if(indegree[i] == 0)
                q.add(i);
        
        while(!q.isEmpty()){
            curr = q.poll();
            
            cnt++;
            
            for(Integer ne: adj.get(curr))
                if(--indegree[ne] == 0)
                    q.add(ne);
        }
        return cnt < V;
    }
}