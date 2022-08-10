class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        int ans = -1;
        
        while(i < n)
        {
            int pos = nums[i];
            if(pos == n)
            {
                i++;
                continue;
            }
            if(i == pos)
                i++;
            else
            {
                if(nums[i] == nums[pos])
                    break;
                //swap
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            }
        }
        for(int j=0;j<n;j++)
            if(nums[j] != j)
                ans = j;
        
        if(ans == -1)
            ans = n;
        
        return ans;
    }
}