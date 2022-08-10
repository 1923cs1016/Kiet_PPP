class Solution {
    public int maxProduct(String[] words) {
        int maxii = 0;
        
        for(int i=0;i<words.length - 1;i++)
        {
            for(int j = i+1; j<words.length;j++)
            {
                if(check(words[i],words[j]))
                    maxii = Math.max(maxii,words[i].length() * words[j].length());
            }
        }
        
        return maxii;
    }
    
    boolean check(String s1, String s2)
    {
        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            if(!mp.containsKey(s1.charAt(i)))
                mp.put(s1.charAt(i),1);
        }
        
        for(int i=0;i<s2.length();i++)
        {
            if(mp.containsKey(s2.charAt(i)))
                return false;
        }
        
        return true;
    }
}