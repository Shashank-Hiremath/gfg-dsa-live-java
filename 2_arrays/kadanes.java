//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1



class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        if(n<=0)
            return -1;
        
        long curr_max_sum=arr[0], final_max_sum=arr[0];
        for(int i=1;i<n;i++){
            curr_max_sum = Math.max(curr_max_sum + arr[i], arr[i]);
            final_max_sum = Math.max(final_max_sum, curr_max_sum);
        }
        return final_max_sum;
        
    }
    
}