//https://practice.geeksforgeeks.org/problems/power-set4302/1


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
	    int len = s.length(), i, n = (int)Math.pow(2, len);
	    List<String> ans = new ArrayList<>();
	    
	    for(int currSet=1;currSet<n;currSet++){
	        StringBuilder currStr = new StringBuilder();
	        
	        for(i=0;i<len;i++){ 
	            if((currSet&(1<<i)) != 0)
	                currStr.append(s.charAt(i));
	        }
	        
	        ans.add(currStr.toString());
	    }
	  
	    Collections.sort(ans);
	    return ans;
    }
}