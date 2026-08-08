class Solution {
    public int mostFrequentEven(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
         for(int a:nums)
         {
            map.put(a,map.getOrDefault(a,0)+1);

         }
         int max=0;
         int ans=-1;
         for(Map.Entry<Integer,Integer> entry:map.entrySet())
         {
           if(entry.getKey()%2==0 &&( (entry.getValue()>max )|| (entry.getValue() == max && entry.getKey() < ans)))
           {
            max=entry.getValue();
            ans=entry.getKey();
           }
         }
         return ans;
    }
}