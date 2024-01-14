//https://www.geeksforgeeks.org/problems/topological-sort/1



/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        LinkedList<Integer> q = new LinkedList<Integer>();
        int indegree[] = new int[V];
        int ans[] = new int[V];
        Arrays.fill(indegree, 0);
        int i, curr;
        
        for(i=0;i<V;i++)
            for(Integer ne: adj.get(i))
                indegree[ne]++;
        for(i=0;i<V;i++)
            if(indegree[i] == 0)
                q.add(i);
        
        i=0;
        while(!q.isEmpty()){
            curr = q.poll();
            
            ans[i++] = curr;
            
            for(Integer ne: adj.get(curr))
                if(--indegree[ne] == 0)
                    q.add(ne);
        }
        return ans;
    }
}