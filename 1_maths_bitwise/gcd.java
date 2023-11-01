//https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1



//User function Template for Java

class Solution
{
    public int gcd(int A , int B) 
    { 
	   // if(A == 0)
	   //     return B;
	   // return gcd(B%A, A);
	   
	   while(A != 0){
	       int prevA = A;
	       A = B%A;
	       B = prevA;
	   }
	   return B;
    } 
}