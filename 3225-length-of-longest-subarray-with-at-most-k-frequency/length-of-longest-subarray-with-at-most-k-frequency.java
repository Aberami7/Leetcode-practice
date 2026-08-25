class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            map.merge(nums[i],1,Integer::sum);
            while(map.get(nums[i])>k)
            {
                map.put(nums[l],map.get(nums[l])-1);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}