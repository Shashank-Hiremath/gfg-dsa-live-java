//https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1



class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        long first, second, cost, ans=0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long a: arr)
            pq.add(a);
        
        while(pq.size()>1)
        {
            first = pq.remove();
            second = pq.remove();
            
            cost = first + second;
            
            ans += cost;
            pq.add(cost);
        }
        return ans;
    }
}