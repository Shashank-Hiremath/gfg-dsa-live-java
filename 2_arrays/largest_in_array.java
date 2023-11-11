//https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/1



//User function Template for Java

class Compute {
    
    public int largest(int arr[], int n)
    {
        if(n == 0){
            return -1;
        }
        
        int ans = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}