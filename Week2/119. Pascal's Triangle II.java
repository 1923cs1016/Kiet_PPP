class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++)
        {
            List<Integer> lst = new ArrayList<>();
            
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                    lst.add(1);
                else
                    lst.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            
            ans.add(lst);
        }
        
        return ans.get(rowIndex);
    }
}