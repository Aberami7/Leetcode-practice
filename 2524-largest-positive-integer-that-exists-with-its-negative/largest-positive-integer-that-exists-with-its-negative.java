class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
           
            for(int j=i+1;j<nums.length;j++)
            {
                    if(-nums[i]==nums[j])
                    {
                        ans=Math.abs(nums[j]);
                         max=Math.max(ans,max);
            }
            
        }
        }
        return max;
    }
}