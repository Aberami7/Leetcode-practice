class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0,0,nums,target);
    }
        int backtrack(int ind,int sum,int[] nums,int target)
        {
            if(ind==nums.length)
            {
                if(sum==target)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            int p=backtrack(ind+1,sum+nums[ind],nums,target);
            int m=backtrack(ind+1,sum-nums[ind],nums,target);
            return p+m;
        }
        
    }
