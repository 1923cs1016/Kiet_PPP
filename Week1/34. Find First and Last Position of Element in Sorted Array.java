class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = firstOcc(nums, target);
        if(f == -1)
            return new int[]{-1,-1};
        int l = lastOcc(nums, target);
        return new int[]{f,l};
    }
    
    int firstOcc(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length - 1;
        int x = -1;
        
        while(s <= e)
        {
            int mid = s + (e - s)/2;
            
            if(nums[mid] == target)
            {
                x = mid;
                e = mid - 1;
            }
            
            else if(nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        
        return x;
    }
    
    int lastOcc(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length - 1;
        int x = -1;
        
        while(s <= e)
        {
            int mid = s + (e - s)/2;
            
            if(nums[mid] == target)
            {
                x = mid;
                s = mid + 1;
            }
            
            else if(nums[mid] > target)
                e = mid - 1;
            else
                s = mid + 1;
        }
        
        return x;
    }
}