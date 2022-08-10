///////////////////////////////////

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1)
            return 0;
        
        int end = -1;
        int max = nums[0];
        
        for(int i=0;i<nums.length;i++)
        {
            if(max > nums[i])
                end = i;
            else
                max = nums[i];
        }
        
        int start = 0;
        int min = nums[nums.length-1];
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(min < nums[i])
                start = i;
            else
                min = nums[i];
        }
        
        return end - start + 1;
    }
}

//////////////////////////////////

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1)
            return 0;
        int[] sortArr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            sortArr[i]=nums[i];
        
        Arrays.sort(sortArr);
        
        //first pass
        int first = -1;
        int second = -1;
        for(int i=0;i<nums.length;i++)
            if(nums[i]!=sortArr[i])
            {
                first = i;
                break;
            }
        
        if(first == -1)
            return 0;
        
        for(int i=nums.length-1;i>=0;i--)
            if(nums[i]!=sortArr[i])
            {
                second = i;
                break;
            }
        
        return second-first+1;
    }
}
