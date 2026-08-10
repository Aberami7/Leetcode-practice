class Solution {
    public boolean divideArray(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()%2!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}