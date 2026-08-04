class Solution {
    Set<List<Integer>> result=new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>());
        return new ArrayList<>(result);
        
        
    }
    void backtrack(int s,int[] nums,List<Integer> list)
    {
        result.add(new ArrayList<>(list));
        
        for(int i=s;i<nums.length;i++)
        {
            list.add(nums[i]);
            backtrack(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}