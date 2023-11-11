//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1



//User function Template for Java
class Solution{
    // static long subarraySum(ArrayList<Integer> arr, int start, int end){
    //     long ans = 0;
    //     for(int i=start;i<end;i++)
    //         ans += arr.get(i);
    //     return ans;
    // }
    
    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n){
        
        // long ma = Long.MIN_VALUE;
        // for(int i=0;i<=n-k;i++)
        //     ma = Math.max(ma, subarraySum(arr, i, i+k));
        // return ma;
        
        long ma = Long.MIN_VALUE, currSum=0;
        int i, j;
        
        for(i=0;i<k;i++)
            currSum += arr.get(i);
        
        ma = currSum;
        for(i=k;i<n;i++){
            currSum += arr.get(i);
            currSum -= arr.get(i-k);
            ma = Math.max(ma, currSum);
            
            // currSum += arr.get(i)-arr.get(i-k);
            // ma = Math.max(ma, currSum);
        }
        return ma;
    }
}