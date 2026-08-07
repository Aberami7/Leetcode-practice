class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
       Arrays.sort(nums);
 
       for(int i=0;i<nums.length-1;i++)
       {
         int c=nums[i];
         int n=nums[i+1];
         while(c+1<n)
         {
            c++;
            list.add(c);
         }
       }
    
   return list;
        
    }
}