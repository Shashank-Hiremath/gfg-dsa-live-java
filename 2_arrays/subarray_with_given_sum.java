//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1



class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int target) 
    {
        if(n<=0)
            return new ArrayList<Integer>() {{add(-1);}};
            
        int left=0, right=0, sum=0;
        
        for(right=0;right<n;right++){
            sum += arr[right];
            while(sum > target && left < right){
                sum -= arr[left];
                left++;
            }
            
            if(sum == target){
                ArrayList<Integer> ans = new ArrayList<Integer>();
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            }
        }
        
        return new ArrayList<Integer>() {{add(-1);}};
    }
}