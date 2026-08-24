class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),list);
        return list;
    }
     public void backtrack(int[] nums,List<Integer> l1,List<List<Integer>> list)
     {
        if(l1.size()==nums.length)
        {
            list.add(new ArrayList<>(l1));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(l1.contains(nums[i]))
            {
                continue;
            }
        
        l1.add(nums[i]);
        backtrack(nums,l1,list);
        l1.remove(l1.size()-1);
        }
     }
        
    }
