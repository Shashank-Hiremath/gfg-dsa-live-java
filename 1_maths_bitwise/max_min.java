//https://practice.geeksforgeeks.org/problems/max-min/1


//User function Template for Java

class Solution
{ 
    public static int findSum(int a[],int n) 
    {
        if(n <= 0)
            return Integer.MIN_VALUE;
        
        int mi = a[0], ma = a[0];
        
        for(int i=1;i<n;i++){
            if(a[i] < mi)
                mi = a[i];
            if(a[i] > ma)
                ma = a[i];
        }
        
        // for(int curr : a){
        //     mi = Math.min(mi, curr);
        //     ma = Math.max(ma, curr);
        // }
        
        return mi + ma;
    }
}