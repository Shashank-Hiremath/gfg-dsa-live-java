//https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1


class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList <Integer> ans = new ArrayList<Integer>(n);
        Deque<Integer> dq = new ArrayDeque<>();
        int i;
        //Forming the first K size window
        for(i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i])
                dq.pollLast();
            dq.addLast(i);
        }
        ans.add(arr[dq.getFirst()]);
        //Start sliding K size window
        for(;i<n;i++)
        {
            while(!dq.isEmpty() && dq.getFirst() <= i-k)
                dq.pollFirst();
            while(!dq.isEmpty() && arr[dq.getLast()] <= arr[i])
                dq.pollLast();
            dq.addLast(i);
            ans.add(arr[dq.getFirst()]);
        }
        return ans;
    }
}