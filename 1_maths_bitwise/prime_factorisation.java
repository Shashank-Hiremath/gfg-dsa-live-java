//https://practice.geeksforgeeks.org/problems/prime-factors5052/1


class Solution
{
    public int[] AllPrimeFactors(int n)
    {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                ans.add(i);
                while(n%i == 0)
                    n = n / i;
            }
        }
        if(n != 1)
            ans.add(n);
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}