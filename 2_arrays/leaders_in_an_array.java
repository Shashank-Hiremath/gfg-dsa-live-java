//https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1



class Solution{
    //Function to find the leaders in the array.
    static public Boolean isLeader(int a[], int n, int i){
        for(int j=i+1;j<n;j++)
            if(a[j] > a[i])
                return false;
        return true;
    }
    
    static ArrayList<Integer> leaders(int a[], int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
            if(isLeader(a, n, i) == true)
                ans.add(a[i]);
        return ans;
        
        // int maxSoFar = a[n-1];
        // int maxFromRight[] = new int[n];
        // maxFromRight[n-1] = a[n-1];
        
        // for(int i=n-2;i>=0;i--){
        //     maxSoFar = Math.max(maxSoFar, a[i]);
        //     maxFromRight[i] = maxSoFar;
            
        //     // maxFromRight[i] = Math.max(maxFromRight[i+1], a[i]);
        // }
        
        // for(int i=0;i<n;i++)
        //     if(a[i] == maxFromRight[i])
        //         ans.add(a[i]);
        // return ans;
    }
}