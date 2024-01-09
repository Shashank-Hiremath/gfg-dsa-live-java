//https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1

class Solution {
    static int[] kthLargest(int k, int[] arr, int n) {
        int[] ans = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i;
        
        for(i=0;i<k;i++)
            pq.add(arr[i]);
        for(i=0;i<k-1;i++)
            ans[i] = -1;
        ans[k-1] = pq.peek();
        
        for(i=k;i<n;i++)
        {
            if(arr[i] > pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
            ans[i] = pq.peek();
        }
        
        return ans;
    }
};






