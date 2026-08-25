class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),list,0);
        return list;
    }

    public void backtrack(int[] nums,List<Integer>l,List<List<Integer>> list,int s)
    {
        if(l.size()>=2)
        {
            list.add(new ArrayList<>(l));
            
        }
        Set<Integer> set=new HashSet<>();
        for(int i=s;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                continue;
            }
            if(!l.isEmpty() && nums[i]<l.get(l.size()-1))
            {
                continue;
            }
            set.add(nums[i]);
            l.add(nums[i]);
            backtrack(nums,l,list,i+1);
            l.remove(l.size()-1);
        }
    }
}
        
    