class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if(arr[0]==500)
        {
            return 500;
        }
        int max=0;
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==entry.getKey() && entry.getValue()>max)
            {
                max=entry.getValue();
                ans=entry.getKey();
            }
          
        }
        return ans;
        
    }
}