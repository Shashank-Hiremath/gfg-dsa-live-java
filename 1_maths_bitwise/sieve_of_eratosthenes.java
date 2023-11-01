//https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int n){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        boolean seive[]=new boolean[n+1];
        Arrays.fill(seive, Boolean.TRUE);
        
        for(int i=2;i*i<=n;i++){
            if(seive[i] == true)
                for(int j=i*i;j<=n;j+=i)
                    seive[j] = false;
        }
        
        for(int i=2;i<=n;i++)
            if(seive[i] == true)
                ans.add(i);
        return ans;
    }
}