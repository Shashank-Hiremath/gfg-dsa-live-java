//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1




class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> s = new Stack<Character>();
        // for(char c: x.toCharArray())
        //     if(s.empty() == true ||
        //     !(s.peek()=='(' && c==')' || 
        //       s.peek()=='{' && c=='}' || 
        //       s.peek()=='[' && c==']'
        //      )
        //     )
        //         s.push(c);
        //     else
        //         s.pop();
        
        for(char c: x.toCharArray())
            if(s.empty() == true)
                s.push(c);
            else if(s.peek()=='(' && c==')' || s.peek()=='{' && c=='}' || s.peek()=='[' && c==']')
                s.pop();
            else
                s.push(c);
        
        return s.empty();
    }
}