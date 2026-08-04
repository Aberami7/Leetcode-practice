class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
      Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Set<Integer> s=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int t=-(nums[i]+nums[j]);
                if(s.contains(t)){
                set.add(Arrays.asList(nums[i],t,nums[j]));  
                }
                s.add(nums[j]);
                
        }
        }
        return new ArrayList<>(set);
        
    }
}