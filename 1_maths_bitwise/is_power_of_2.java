//https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        ////O(Log n) approach
        // if(n <= 0)
        //     return false;
        // while(n != 1){
        //     if(n%2 != 0)
        //         return false;
        //     n = n / 2;
        // }
        // return true;

        long longn = n;
        return longn != 0 && (longn & (longn-1)) == 0;
    }
}