class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l=0;
        int r=nums.length-1;
        long sum=0;
       
        while(l<r)
        {
          String s=String.valueOf(nums[l])+ String.valueOf(nums[r]) ; 
           sum+=Long.valueOf(s);
          l++;
          r--;
         
        }
        if(nums.length%2!=0)
        {
            sum+=nums[nums.length/2];
        }
        return sum;
        
    }
}