//https://practice.geeksforgeeks.org/problems/element-appearing-once2552/1


//User function Template for Java

class Sol
{
    public static int search(int a[], int n)
    {
	    if(n<=0)
	        return -1;
	    int ans = a[0];
	    for(int i=1;i<n;i++)
	        ans = ans ^ a[i];
	    return ans;
    }
}