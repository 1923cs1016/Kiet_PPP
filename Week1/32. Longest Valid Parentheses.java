/*
Approach : Imaging we are coloring the original string, each substring that has valid parentheses is colored with '1' and other characters are colored by '0'.
For example "( ) ( ( ) "would become "11011". Thus, the problem has converted to finding the longest subsequence that all elements are '1', which could be easily solved.
*/

class Solution {
    class Pair
    {
        char b;
        int i;
        
        Pair(){};
        Pair(char _b, int _i)
        {
            b = _b;
            i = _i;
        }
    }
    
    public int longestValidParentheses(String s) {
        Stack<Pair> st = new Stack<>();
        StringBuilder str = new StringBuilder(s);
        
        for(int i=0;i<str.length();i++)
        {
            Pair curr = new Pair(str.charAt(i),i);
            if(st.isEmpty())
                st.push(curr);
            else
            {
                if(curr.b == '(')
                    st.push(curr);
                else
                {
                    if(st.peek().b == '(')
                        st.pop();
                    else
                        st.push(curr);
                }
            }
        }
        
        int[] arr = new int[s.length()];
        Arrays.fill(arr,1);
        
        for(Pair p : st)
            arr[p.i] = 0;
        
        // now find longest 1 subsequence in arr
        
        int ones_max = 0;
        int ones_curr = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 1)
                ones_curr++;
            else
            {
                ones_max = Math.max(ones_max, ones_curr);
                ones_curr = 0;
            }
        }
        
        return Math.max(ones_curr, ones_max);
    }
}
