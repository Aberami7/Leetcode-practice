class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int x=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                x=entry.getKey();
            }
        }
        return x;
        

        
    }
}