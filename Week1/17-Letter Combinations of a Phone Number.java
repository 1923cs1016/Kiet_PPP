class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,Character> mp = new HashMap<>();
        mp.put('2','a');mp.put('3','d');mp.put('4','g');mp.put('5','j');
        mp.put('6','m');mp.put('7','p');mp.put('8','t');mp.put('9','w');
        List<String> ans;
        
        return combination("", digits, mp, new ArrayList<>());
    }
    
    public List<String> combination(String p, String up, Map<Character,Character> mp, List<String> ans)
    {
        if(up.length()==0)
        {
            if(p.length() != 0)
                ans.add(p);
            return ans;
        }
        
        int c = 3;
        if(up.charAt(0) == '7' || up.charAt(0) == '9')
            c = 4;
        
        for(int i=0;i<c;i++)
        {
            combination(p + (char)(mp.get(up.charAt(0)) + i), up.substring(1), mp, ans);
        }
        
        return ans;
    }
}
