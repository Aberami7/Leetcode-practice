class Solution {
    public int digitFrequencyScore(int n) {
        List<Integer> list=new ArrayList<>();
        while(n!=0)
        {
            int r=n%10;
            list.add(r);
            n=n/10;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:list)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        
            }
            int sum=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
              sum+=entry.getKey()*entry.getValue();
            }
        
        return sum;
    }
}