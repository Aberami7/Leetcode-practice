class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);

        }
        int max=0;
        int ans=-1;
        for(int a:arr)
        {
            if(map.get(a)>max)
            {
                max=map.get(a);
                ans=a;
            }
        }
        return ans;
        
    }
}