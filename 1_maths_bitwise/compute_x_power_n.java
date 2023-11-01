//https://leetcode.com/problems/powx-n/description/


class Solution {

    public double f(double x, int n) //Iterative O(log n)
    {
        // double ans = 1;
        // while(n != 0){
        //     if((n&1) != 0)
        //         ans = ans * x;
        //     x = x * x;
        //     n = n/2;
        // }
        // return ans;

        //Recursive O(n)
        if(n==0)
            return 1;
        double y = f(x, n/2);
        if((n&1) != 0)
            return x*y*y;
        else
            return y*y;
    }

    public double myPow(double x, int n) {
        if(n<0)
            return f(1/x, n);
        return f(x, n);
    }
}