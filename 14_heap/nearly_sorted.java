//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1


class Solution
{
    //Function to return the sorted array.
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
        ArrayList <Integer> ans = new ArrayList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i;
        for(i=0;i<Math.min(num, k+1);i++)
            pq.add(arr[i]);
        while(!pq.isEmpty())
        {
            ans.add(pq.poll());
            if(i<num)
                pq.add(arr[i++]);
        }
        return ans;
    }
}