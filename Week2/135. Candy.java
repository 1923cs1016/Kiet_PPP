class Solution {
    public int candy(int[] ratings) {
        // candy array
        int[] a = new int[ratings.length];
        Arrays.fill(a,1);
        // bcz everyone needs atleast one candy
        
        //now iterate from left and if nxt > prev increase candy
        for(int i = 0; i < ratings.length - 1; i++)
        {
            if(ratings[i + 1] > ratings[i])
                a[i + 1] = a[i] + 1; //increase candy one more than prev
        }
        
        //now iterate from right to left if prev > nxt increase candy
        for(int i = ratings.length - 1; i > 0; i--)
        {
            if(ratings[i - 1] > ratings[i])
            {
                a[i - 1] = Math.max(a[i] + 1,a[i - 1]);  //increase candy one more than nxt
                
            }
        }
        
        //take all candies
        int sum = 0;
        for(int i : a)
            sum += i;
        
        return sum;
    }
}