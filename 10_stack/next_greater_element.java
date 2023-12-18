//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1



class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] ans = new long[n];
        Stack<Long> st = new Stack<Long>();
        for(int i=0;i<n;i++){
            while(!st.empty() && arr[st.peek().intValue()] < arr[i]){
                ans[st.pop().intValue()] = arr[i];
            }
            st.push((long)i);
        }
        while(!st.empty()){
            ans[st.pop().intValue()] = -1;
        }
        return ans;
    } 
}