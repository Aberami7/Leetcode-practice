class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] p=new int[nums.length];
        int[] s=new int[nums.length];
        p[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            p[i]=p[i-1]+nums[i-1];
        }
        s[s.length-1]=0;
         for(int i=nums.length-2;i>=0;i--)
        {
            s[i]=s[i+1]+nums[i+1];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(p[i]-s[i]);
        }
        return ans;
        
    }
}