//https://www.geeksforgeeks.org/problems/level-of-nodes-1587115620/1

/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int v, ArrayList<ArrayList<Integer>> adj, int target)
    {        
        int level = 0, size, curr;
        boolean visited[] = new boolean[v];
        
        visited[0] = true;
        
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(0);
        
        while(!q.isEmpty()){
            for(size=q.size();size>0;size--){
                curr = q.poll();

                if(curr == target)
                    return level;
                
                for(Integer ne: adj.get(curr))
                    if(!visited[ne]){
                        visited[ne] = true;
                        q.add(ne);
                    }
            }
            level++;
        }
        return -1;
    }
}