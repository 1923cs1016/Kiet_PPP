//bit manipulation

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        while(n != 0)
        {
            if((n & 1) == 1)
                c++;
            n = n >>> 1;
        }
        
        return c;
    }
}

// string approach
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        String s = Integer.toBinaryString(n);
        int c = 0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i) == '1')
                c++;
        
        return c;
    }
}