//https://www.geeksforgeeks.org/problems/possible-paths-between-2-vertices-1587115620/1



class Solution {
    // Function to count paths between two vertices in a directed acyclic graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        //Using DFS
    //     if(source == destination)
    //         return 1;
    //     int sum = 0;
    //     for(Integer ne: adj.get(source))
    //         sum += countPaths(V, adj, ne, destination);
    //     return sum;
    
        //Using BFS
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(source);
        int curr, cnt=0;
        while(!q.isEmpty())
        {
            curr = q.poll();
            if(curr == destination)
                cnt++;
            for(Integer ne: adj.get(curr))
                q.add(ne);
        }
        return cnt;
    }
}